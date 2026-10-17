package com.tecnomega.proyectopersistencia001;

import com.productos.entities.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Alex
 */
public class ProyectoPersistencia001 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new PanelTecnomega().setVisible(true);
        });
    }
}
