package com.SistemaGestionMedica.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.SistemaGestionMedica.dto.UsuarioDto;
import com.SistemaGestionMedica.entity.Rol;
import com.SistemaGestionMedica.entity.Usuario;
import com.SistemaGestionMedica.repository.RolRepository;
import com.SistemaGestionMedica.repository.UsuarioRepository;
import com.SistemaGestionMedica.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private PasswordEncoder passwordEncoder;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository,
                           RolRepository rolRepository,
                           PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(UsuarioDto usuarioDto) {
        Usuario Usuario = new Usuario();
        Usuario.setNombre(usuarioDto.getNombre() + " " + usuarioDto.getApellido());
        Usuario.setEmail(usuarioDto.getEmail());

        //encrypt the password once we integrate spring security
        //user.setPassword(userDto.getPassword());
        Usuario.setClave(passwordEncoder.encode(usuarioDto.getClave()));
        Rol rol = rolRepository.findByName("ROLE_ADMIN");
        if(rol == null){
        	rol = checkRoleExist();
        }
        Usuario.setRoles(Arrays.asList(rol));
        usuarioRepository.save(Usuario);
    }

    @Override
    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public List<UsuarioDto> findAllUsers() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map((usuario) -> convertEntityToDto(usuario))
                .collect(Collectors.toList());
    }

    private UsuarioDto convertEntityToDto(Usuario usuario){
    	UsuarioDto userDto = new UsuarioDto();
        String[] name = usuario.getNombre().split(" ");
        userDto.setNombre(name[0]);
        userDto.setApellido(name[1]);
        userDto.setEmail(usuario.getEmail());
        return userDto;
    }

    private Rol checkRoleExist() {
        Rol rol = new Rol();
        rol.setName("ROLE_ADMIN");
        return rolRepository.save(rol);
    }

}
