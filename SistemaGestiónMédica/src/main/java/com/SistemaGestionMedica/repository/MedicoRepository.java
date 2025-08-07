package com.SistemaGestionMedica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaGestionMedica.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    

}
