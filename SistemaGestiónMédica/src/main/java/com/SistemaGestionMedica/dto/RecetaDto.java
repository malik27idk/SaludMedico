package com.SistemaGestionMedica.dto;

import java.time.LocalDate;
import java.util.List;

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
public class RecetaDto {
    private Long id;
    private LocalDate fechaEmision;
    private LocalDate fechaCaducidad;
    private Long pacienteId;
    private Long medicoId;
    private List<ItemRecetaDto> items;

}
