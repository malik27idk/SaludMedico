package com.SistemaGestionMedica.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_receta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dosis;

    private String frecuencia;

    @ManyToOne
    private Receta receta;

    @ManyToOne
    private Medicamento medicamento;

}
