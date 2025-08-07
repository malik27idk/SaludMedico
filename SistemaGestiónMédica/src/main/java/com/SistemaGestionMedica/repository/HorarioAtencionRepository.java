package com.SistemaGestionMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.HorarioAtencion;

@Repository
public interface HorarioAtencionRepository extends JpaRepository<HorarioAtencion, Long>{

}
