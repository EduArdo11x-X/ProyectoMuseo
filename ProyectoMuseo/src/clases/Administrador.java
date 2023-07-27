/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author EDU
 */
public class Administrador extends Persona{
private double sueldo;
private int años_experiencia;
private String titulo_universitario;

    public Administrador() {
    }

    public Administrador(double sueldo, int años_experiencia, String titulo_universitario, String cedula, String nombre, String apellido, Date F_nacimiento, String num_telefono, char genero, String provincia, String ciudad, String calle, String correo, String contraseña) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, genero, provincia, ciudad, calle, correo, contraseña);
        this.sueldo = sueldo;
        this.años_experiencia = años_experiencia;
        this.titulo_universitario = titulo_universitario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    public String getTitulo_universitario() {
        return titulo_universitario;
    }

    public void setTitulo_universitario(String titulo_universitario) {
        this.titulo_universitario = titulo_universitario;
    }

    @Override
    public String toString() {
        return "Administrador{" + "sueldo=" + sueldo + ", a\u00f1os_experiencia=" + años_experiencia + ", titulo_universitario=" + titulo_universitario + '}';
    }


    
}
