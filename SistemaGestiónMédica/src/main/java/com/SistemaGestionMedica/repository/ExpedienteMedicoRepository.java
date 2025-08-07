package com.SistemaGestionMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.ExpedienteMedico;

@Repository
public interface ExpedienteMedicoRepository  extends JpaRepository<ExpedienteMedico, Long>{

}
