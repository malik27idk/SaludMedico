package com.SistemaGestionMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.Alergia;

@Repository
public interface AlergiaRepository extends JpaRepository<Alergia, Long> {

}
