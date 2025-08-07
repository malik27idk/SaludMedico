package com.SistemaGestionMedica.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entrada_historial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntradaHistorial {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "expediente_id")
    private ExpedienteMedico expediente;

    @OneToOne
    @JoinColumn(name = "cita_id", unique = true)
    private Cita cita;

    @Column(nullable = false)
    private String diagnostico;
    
    @Column(nullable = false)
    private String tratamiento;
    
    @Column(nullable = false)
    private String observaciones;

    @OneToOne(mappedBy = "entrada", cascade = CascadeType.ALL)
    private Receta receta;

	
}
