/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Escultura extends ObrArte{
  private String material;
  private double peso;
  private double altura;

    public Escultura() {
        super();
    }

   

    public Escultura(String material, double peso, double altura, String codigo, String nombre, String descripcion, Date fecha_creacion) {
        super(codigo, nombre, descripcion, fecha_creacion);
        this.material = material;
        this.peso = peso;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Escultura{" + "material=" + material + ", peso=" + peso + ", altura=" + altura + '}';
    }
  
}
