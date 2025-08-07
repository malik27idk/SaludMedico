package com.SistemaGestionMedica.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto
{
    private Long id;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty(message = "El Email no puede estar vacio")
    @Email
    private String email;
    
    @NotEmpty(message = "La Contraseña no puede estar vacia")
    private String clave;
}
