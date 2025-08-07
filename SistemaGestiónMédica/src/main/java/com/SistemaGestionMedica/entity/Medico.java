package com.SistemaGestionMedica.entity;

import java.math.BigDecimal;
import java.util.List;

import com.SistemaGestionMedica.enums.Enum.Especialidad;
import com.SistemaGestionMedica.enums.Enum.EstadoDoctor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false, unique = true)
    private String numeroLicencia;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Enumerated(EnumType.STRING)
    private EstadoDoctor estado;

    @Column(nullable = false)
    private boolean disponible;

    @Column(nullable = false)
    private BigDecimal tarifaConsulta;

    @OneToOne
    @JoinColumn(name = "usuario_id", unique = true)
    private Usuario usuario;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<HorarioAtencion> horarios;
}
