package com.SistemaGestionMedica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {
	
}


