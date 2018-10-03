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
import mx.unam.ciencias.is.modelo.Profesor;
import mx.unam.ciencias.is.modelo.dao.ProfesorDAO;
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

public class RegistrarProfesor {
    private String password1;  
    private String correo;
    private String nombre;

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
    
    public String registrarProfesor(){
        Date date = new Date ();
        Profesor pNuevo = new Profesor(correo, nombre, password1, null, date);
        new ProfesorDAO().crear(pNuevo);
        return "/index.xhtml?faces-redirect=true";
    }
}
