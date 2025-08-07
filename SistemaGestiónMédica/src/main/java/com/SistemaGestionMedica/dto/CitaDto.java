package com.SistemaGestionMedica.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.SistemaGestionMedica.enums.Enum.EstadoCita;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CitaDto {
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private Long pacienteId;
    private Long medicoId;
    private String motivo;
    private EstadoCita estado;
    private BigDecimal tarifaAplicada;
}
