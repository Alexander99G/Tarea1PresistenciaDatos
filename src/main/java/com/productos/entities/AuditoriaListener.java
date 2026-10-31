// Clase AuditoriaListener.java (Buena Práctica II: Clase separada para interceptar estados)
package com.productos.entities;
import jakarta.persistence.*;

public class AuditoriaListener {
    @PrePersist
    public void antesDeGuardar(Object entidad) {
        System.out.println("[AUDITORÍA - PrePersist] Por guardar: " + entidad.getClass().getSimpleName());
    }
    @PostPersist
    public void despuesDeGuardar(Object entidad) {
        System.out.println("[AUDITORÍA - PostPersist] Guardado exitoso: " + entidad.getClass().getSimpleName());
    }
    @PreUpdate
    public void antesDeActualizar(Object entidad) {
        System.out.println("[AUDITORÍA - PreUpdate] Actualizando: " + entidad.getClass().getSimpleName());
    }
}