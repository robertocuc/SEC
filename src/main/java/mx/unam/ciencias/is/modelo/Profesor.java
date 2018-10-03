/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author roberto
 */
public class Profesor implements java.io.Serializable{
    private String correo;
    private String nombreProfesor;
    private String contrasena;
    private String rutaFoto;
    private Date fechaRegistro;
    
    
    public Profesor() {
    }

	
    public Profesor(String correo) {
        this.correo = correo;
    }
    public Profesor(String correo, String nombreProfesor, String contrasena, String rutaFoto, Date fechaRegistro) {
       this.correo = correo;
       this.nombreProfesor = nombreProfesor;
       this.contrasena = contrasena;
       this.rutaFoto = rutaFoto;
       this.fechaRegistro = fechaRegistro;
       
    }

    public Profesor(String correo, String nombre, String password1, Object object, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombreProfesor() {
        return this.nombreProfesor;
    }
    
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getRutaFoto() {
        return this.rutaFoto;
    }
    
    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
     
     
    
}
