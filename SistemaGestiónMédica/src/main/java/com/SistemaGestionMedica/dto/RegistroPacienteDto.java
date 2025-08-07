package com.SistemaGestionMedica.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class RegistroPacienteDto {

	@NotEmpty(message = "El nombre no puede estar vacio")
    private String nombre;

	@NotEmpty(message = "El número de identificación no puede estar vacio")
    private String numeroIdentificacion;

    @NotNull(message = "La fecha de nacimiento es obligatoria y no puede dejarse en blanco")
    private LocalDate fechaNacimiento;

    @NotEmpty(message = "El nombre de usuario no puede estar vacio")
    private String username;

    @NotEmpty(message = "El correo no puede estar vacio")
    @Email(message = "Debe ser un correo válido")
    private String email;

    @NotEmpty(message = "La contraseña no puede estar vacia")
    private String password;

}
