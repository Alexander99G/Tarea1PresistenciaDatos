package com.productos.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Getter @Setter @NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull
    @Size(min = 3, max = 50)
    @Column(name = "cl_nombre", nullable = false)
    private String nombre;

    @NotNull
    @Email(message = "Formato de correo inválido")
    @Column(name = "cl_correo")
    private String correo;

    @Pattern(regexp = "^(\\+593|0)[0-9]{8,9}$", message = "Teléfono inválido")
    @Column(name = "cl_telefono")
    private String telefono;

    @NotNull
    @Size(min = 10, max = 13)
    @Column(name = "cl_cedula", unique = true, nullable = false)
    private String cedula;

    // Relación 1 a 1  Cliente tiene un Usuario 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    // Relación 1 a 1..* (Un cliente registra muchas facturas 
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Factura> facturas;
}