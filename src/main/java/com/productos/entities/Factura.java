package com.productos.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_factura")
@Getter @Setter @NoArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "fac_fecha", nullable = false)
    private Date fecha;

    @PositiveOrZero
    @Column(name = "fac_subtotal15")
    private Double subtotal15;

    @PositiveOrZero
    @Column(name = "fac_iva")
    private Double iva;

    @PositiveOrZero
    @Column(name = "fac_descuento")
    private Double descuento;

    @Positive
    @Column(name = "fac_valor_total", nullable = false)
    private Double valorTotal;

    // Relación 1..* a 1 Muchas facturas pertenecen a un Cliente 
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    // Relación 1 a 1..*  una Factura tiene muchos DetalleFactura 
    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles;
}