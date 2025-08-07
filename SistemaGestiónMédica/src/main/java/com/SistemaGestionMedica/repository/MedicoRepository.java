package com.SistemaGestionMedica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    

}
