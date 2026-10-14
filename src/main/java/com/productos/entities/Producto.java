package com.productos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_producto")
@Getter 
@Setter 
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "pr_id", nullable = false)
    private Integer id;

    @Column(name = "pr_nombre", nullable = false)
    private String nombre;

    @Column(name = "pr_cantidad")
    private Integer cantidad;

    @Column(name = "pr_precio")
    private Double precio;

    public Producto(String nombre, Integer cantidad, Double precio){
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.precio=precio;
    }

}