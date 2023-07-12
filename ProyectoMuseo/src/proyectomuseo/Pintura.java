/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomuseo;

/**
 *
 * @author LENOVO
 */
public class Pintura {
    private String tipo;
    private String estilo;

    public Pintura() {
    }

    public Pintura(String tipo, String estilo) {
        this.tipo = tipo;
        this.estilo = estilo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Pintura{" + "tipo=" + tipo + ", estilo=" + estilo + '}';
    }
    
    
}
