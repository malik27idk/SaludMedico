package com.SistemaGestionMedica.dto;

import java.time.LocalDate;

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
public class PacienteDto {
    private Long id;
    private String nombre;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String email;

}
