package com.SistemaGestionMedica.dto;

import java.math.BigDecimal;

import com.SistemaGestionMedica.enums.Enum.Especialidad;
import com.SistemaGestionMedica.enums.Enum.EstadoDoctor;

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
public class MedicoDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroLicencia;
    private String telefono;
    private String email;
    private Especialidad especialidad;
    private EstadoDoctor estado;
    private boolean disponible;
    private BigDecimal tarifaConsulta;

}
