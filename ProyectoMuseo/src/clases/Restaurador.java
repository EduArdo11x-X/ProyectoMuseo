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
public class Restaurador extends Persona {
    
    private String Id_restaurador;
    private String Habilidades;

    public Restaurador(String Id_restaurador, String Habilidades) {
        this.Id_restaurador = Id_restaurador;
        this.Habilidades = Habilidades;
    }

    public Restaurador(String Id_restaurador, String Habilidades, String cedula, String nombre, String apellido, Date F_nacimiento, String num_telefono, char genero, String provincia, String ciudad, String calle, String correo, String contraseña) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, genero, provincia, ciudad, calle, correo, contraseña);
        this.Id_restaurador = Id_restaurador;
        this.Habilidades = Habilidades;
    }

    public Restaurador() {
    }

    public String getId_restaurador() {
        return Id_restaurador;
    }

    public void setId_restaurador(String Id_restaurador) {
        this.Id_restaurador = Id_restaurador;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String Habilidades) {
        this.Habilidades = Habilidades;
    }

    @Override
    public String toString() {
        return "Restaurador{" + "Id_restaurador=" + Id_restaurador + ", Habilidades=" + Habilidades + '}';
    }
    
    

    
}
