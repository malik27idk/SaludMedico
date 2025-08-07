package com.SistemaGestionMedica.dto;

import java.time.LocalDateTime;

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
public class EntradaHistorialDto {
    private Long id;
    private LocalDateTime fechaHora;
    private String diagnostico;
    private String tratamiento;

}
