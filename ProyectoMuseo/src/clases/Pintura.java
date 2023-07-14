/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Pintura extends ObrArte{

   private String estilo;
   private String tipo;

    public Pintura() {
    }

    public Pintura(String estilo, String tipo, String codigo, String nombre, String descripcion, Date fecha_creacion) {
        super(codigo, nombre, descripcion, fecha_creacion);
        this.estilo = estilo;
        this.tipo = tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pintura{" + "estilo=" + estilo + ", tipo=" + tipo + '}';
    }
   
   
}
