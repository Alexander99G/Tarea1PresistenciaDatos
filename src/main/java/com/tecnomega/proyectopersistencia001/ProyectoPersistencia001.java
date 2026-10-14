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
        
        try(EntityManagerFactory emf= Persistence.createEntityManagerFactory("com.tecnomega_ProyectoPersistencia001_jar_1.0-SNAPSHOTPU"))
        {
            EntityManager manager=emf.createEntityManager();
            manager.getTransaction().begin();
            
            Producto pr1=new Producto ("Memoria RAM DDR4", 10, 200.15);
            manager.persist(pr1);
            
            manager.getTransaction().commit();
            
            }
    }
}


