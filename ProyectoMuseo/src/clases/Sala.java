/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author EDU
 */
public class Sala {
    private String codigo;
    private String nombre;
    private int capacidad;
    private String tematica;

    public Sala() {
    }

    public Sala(String codigo, String nombre, int capacidad, String tematica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tematica = tematica;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Sala{" + "codigo=" + codigo + ", nombre=" + nombre + ", capacidad=" + capacidad + ", tematica=" + tematica + '}';
    }
    
    
}
