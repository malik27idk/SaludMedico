package com.SistemaGestionMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.Enfermedad;
@Repository
public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long>{

}
