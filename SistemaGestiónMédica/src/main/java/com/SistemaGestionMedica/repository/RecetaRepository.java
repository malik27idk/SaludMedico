package com.SistemaGestionMedica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaGestionMedica.entity.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
	
}


