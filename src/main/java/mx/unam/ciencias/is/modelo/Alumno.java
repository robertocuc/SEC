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
public class Alumno implements java.io.Serializable{
    private String correo;
    private String nombreAlumno;
    private String contrasena;
    private String numTel;
    private Date fechaRegistro;
    
    
    public Alumno() {
    }

	
    public Alumno(String correo) {
        this.correo = correo;
    }
    public Alumno(String correo, String nombreAlumno, String contrasena, String telefono, Date fechaRegistro) {
       this.correo = correo;
       this.nombreAlumno = nombreAlumno;
       this.contrasena = contrasena;
       this.numTel = telefono;
       this.fechaRegistro = fechaRegistro;
       
    }

    public Alumno(String correo, String nombre, String password1, Number telNumber, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombreAlumno() {
        return this.nombreAlumno;
    }
    
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNumTel() {
        return this.numTel;
    }
    
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
     
     
    
}
