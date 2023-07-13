/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LENOVO
 */
public class Escultura {
    private String Materialelaborado;
    private String peso;
    private String altura;

    public Escultura() {
    }

    
    public Escultura(String Materialelaborado, String peso, String altura) {
        this.Materialelaborado = Materialelaborado;
        this.peso = peso;
        this.altura = altura;
    }

    public String getMaterialelaborado() {
        return Materialelaborado;
    }

    public void setMaterialelaborado(String Materialelaborado) {
        this.Materialelaborado = Materialelaborado;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
}
