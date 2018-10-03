/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo.dao;

import mx.unam.ciencias.is.modelo.HibernateUtil;
import mx.unam.ciencias.is.modelo.Profesor;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author roberto
 */
public class ProfesorDAO {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
   * Añade un nuevo profesor
   *
   * @param profesorNuevo El alumno a añadir a la BD
   */
  public void crear(Profesor profesorNuevo) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      session.persist(profesorNuevo);

      tx.commit();

    } catch (HibernateException e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      session.close();
    }

  }

  /**
   * Obtiene un profesor
   *
   * @param correoProfesor El correo que identifica al alumno que se desea
   * obtener de la BD
   * @return El alumno identificado por el correo, o null si no existe
   */
  public Profesor obtener(String correoProfesor) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    Profesor profesorObtenido = null;
    try {
      tx = session.beginTransaction();

      String queryString = "from Alumno a where a.correo=:c";
      Query query = session.createQuery(queryString);
      query.setParameter("c", correoProfesor);

      profesorObtenido = (Profesor) query.uniqueResult();

      tx.commit();

    } catch (HibernateException e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      session.close();
    }
    return profesorObtenido;
  }

  /**
   * Actualiza un profesor
   *
   * @param profesorActualizado Un profesor previamente obtenido con
   * {@link #obtener(java.lang.String) obtener}
   */
  public void actualizar(Profesor profesorActualizado) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      session.merge(profesorActualizado);

      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      session.close();
    }
  }

    public Profesor encuentra(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
