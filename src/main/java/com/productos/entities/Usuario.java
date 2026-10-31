package com.productos.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_usuario")
@Getter @Setter @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull(message = "El login es obligatorio")
    @Size(min = 4, max = 30)
    @Column(name = "us_login", nullable = false, unique = true)
    private String login;

    @NotNull(message = "La clave es obligatoria")
    @Size(min = 6, max = 100)
    @Column(name = "us_clave", nullable = false)
    private String clave;

    // Relación 1 a 1 con Cliente 
    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;
}
