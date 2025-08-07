package com.SistemaGestionMedica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SistemaGestionMedica.dto.UsuarioDto;
import com.SistemaGestionMedica.entity.Usuario;

@Service
public interface UsuarioService {
	
	void saveUser(UsuarioDto userDto);

    Usuario findByEmail(String email);

    List<UsuarioDto> findAllUsers();
}
