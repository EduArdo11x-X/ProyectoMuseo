/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Guardia extends Persona {
    
    private String id_guardia;
    private int anios_experiencia;
    private boolean disponibilidad;

    public Guardia(String id_guardia, int anios_experiencia, boolean disponibilidad) {
        this.id_guardia = id_guardia;
        this.anios_experiencia = anios_experiencia;
        this.disponibilidad = disponibilidad;
    }

    public Guardia(String id_guardia, int anios_experiencia, boolean disponibilidad, String cedula, String nombre, String apellido, Date F_nacimiento, String num_telefono, char genero, String provincia, String ciudad, String calle, String correo, String contraseña) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, genero, provincia, ciudad, calle, correo, contraseña);
        this.id_guardia = id_guardia;
        this.anios_experiencia = anios_experiencia;
        this.disponibilidad = disponibilidad;
    }

    public Guardia() {
    }

    public String getId_guardia() {
        return id_guardia;
    }

    public void setId_guardia(String id_guardia) {
        this.id_guardia = id_guardia;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Guardia{" + "id_guardia=" + id_guardia + ", anios_experiencia=" + anios_experiencia + ", disponibilidad=" + disponibilidad + '}';
    }

}
