/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import mx.unam.ciencias.is.modelo.Alumno;
import mx.unam.ciencias.is.modelo.dao.AlumnoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author roberto
 */
@Controller 

public class RegistrarAlumno {
    private String password1;  
    private String correo;
    private String nombre;
    private String telefono;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
    
    public String getTelefono() {
        return correo;
    }

    public void setTelefono(String correo) {
        this.telefono = telefono;
    }
    
    public String registrarAlumno(){
        Date date = new Date ();
        Alumno aNuevo = new Alumno(correo, nombre, password1, telefono, date);
        new AlumnoDAO().crear(aNuevo);
        return "/index.xhtml?faces-redirect=true";
    }

    @RequestMapping(value="/registrar_alumno", method = RequestMethod.GET)
    public ModelAndView registrar_alumno(HttpServletRequest request,ModelMap model){
            return new ModelAndView("registrar_alumno",model);
    }
}
