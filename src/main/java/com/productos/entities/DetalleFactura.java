package com.productos.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_detalle_factura")
@Getter @Setter @NoArgsConstructor
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Min(value = 1, message = "La cantidad mínima es 1")
    @Column(name = "det_cantidad", nullable = false)
    private int cantidad;

    @Positive
    @Column(name = "det_precio_venta", nullable = false)
    private Double precioVenta;

    @PositiveOrZero
    @Column(name = "det_descuento_producto")
    private Double descuentoProducto;

    @Positive
    @Column(name = "det_precio_final", nullable = false)
    private Double precioFinal;

    // Relación 1..* a 1  Dueño de la factura hacia Factura
    @ManyToOne
    @JoinColumn(name = "factura_id", nullable = false)
    private Factura factura;

    // Relación 1..* a 1  Dueño de la factura hacia Producto
    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;
    
}