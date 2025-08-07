package com.SistemaGestionMedica.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SistemaGestionMedica.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findByPacienteIdAndFecha(Long pacienteId, LocalDate fecha);
    boolean existsByMedicoIdAndFechaAndHora(Long medicoId, LocalDate fecha, LocalTime hora);

}
