package com.SistemaGestionMedica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaGestionMedica.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    Optional<Medicamento> findByNombre(String nombre);

}
