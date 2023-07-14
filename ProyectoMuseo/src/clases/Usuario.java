/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Usuario extends Persona{
    
    private String nivel_conocimiento;
    private String nivel_estudiol;

    public Usuario() {
        super();
    }

    public Usuario(String nivel_conocimiento, String nivel_estudiol, String cedula, String nombre, String apellido, Date F_nacimiento, int num_telefono, char genero, String provincia, String ciudad, String calle, String correo, String contraseña) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, genero, provincia, ciudad, calle, correo, contraseña);
        this.nivel_conocimiento = nivel_conocimiento;
        this.nivel_estudiol = nivel_estudiol;
    }

    public String getNivel_conocimiento() {
        return nivel_conocimiento;
    }

    public void setNivel_conocimiento(String nivel_conocimiento) {
        this.nivel_conocimiento = nivel_conocimiento;
    }

    public String getNivel_estudiol() {
        return nivel_estudiol;
    }

    public void setNivel_estudiol(String nivel_estudiol) {
        this.nivel_estudiol = nivel_estudiol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nivel_conocimiento=" + nivel_conocimiento + ", nivel_estudiol=" + nivel_estudiol + '}';
    }
    
    
    
    

  

  
    
}
