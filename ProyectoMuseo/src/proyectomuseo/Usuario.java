/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomuseo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Usuario extends Persona_1{
    
    private String id_Usuario;
    private String nivel_conoci;

    public Usuario() {
        super();
    }

    public Usuario(String id_Usuario, String nivel_conoci, String cedula, String nombre, String apellido, Date F_nacimiento, int num_telefono, String provincia, String ciudad, String calle, String correo, String genero) {
        super(cedula, nombre, apellido, F_nacimiento, num_telefono, provincia, ciudad, calle, correo, genero);
        this.id_Usuario = id_Usuario;
        this.nivel_conoci = nivel_conoci;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNivel_conoci() {
        return nivel_conoci;
    }

    public void setNivel_conoci(String nivel_conoci) {
        this.nivel_conoci = nivel_conoci;
    }

    @Override
    public String toString() {
        return super.toString()+"Usuario{" + "id_Usuario=" + id_Usuario + ", nivel_conoci=" + nivel_conoci + '}';
    }
    
    
    
    
}
