package com.SistemaGestionMedica.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombre;

	    @Column(nullable = false, unique = true)
	    private String email;

	    @Column(nullable = false)
	    private String clave;

	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(
	        name = "usuario_roles",
	        joinColumns = {@JoinColumn(name = "usuario_id",  referencedColumnName="id")},
	        inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName="id")})
	    
	    private Set<Rol> roles = new HashSet();
	
}
