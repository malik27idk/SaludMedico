package com.SistemaGestionMedica.dto;

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
public class ItemRecetaDto {
    private Long id;
    private Long medicamentoId;
    private String dosis;
    private String frecuencia;

}
