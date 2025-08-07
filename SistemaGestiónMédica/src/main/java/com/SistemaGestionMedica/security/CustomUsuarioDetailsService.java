package com.SistemaGestionMedica.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SistemaGestionMedica.entity.Rol;
import com.SistemaGestionMedica.entity.Usuario;
import com.SistemaGestionMedica.repository.UsuarioRepository;


@Service
public class CustomUsuarioDetailsService implements UserDetailsService {

    private UsuarioRepository usuarioRepository;

    public CustomUsuarioDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario != null) {
            return new org.springframework.security.core.userdetails.User(usuario.getEmail(),
            		usuario.getClave(),
                    mapRolesToAuthorities(usuario.getRoles()));
        }else{
            throw new UsernameNotFoundException("Error clave o usuario.");
        }
    }

    private Collection < ? extends GrantedAuthority> mapRolesToAuthorities(Collection <Rol> roles) {
        Collection < ? extends GrantedAuthority> mapRoles = roles.stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getName()) )
                .collect(Collectors.toList());
        return mapRoles;
    }

}
