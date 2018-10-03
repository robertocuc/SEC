/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo.dao;

import mx.unam.ciencias.is.modelo.HibernateUtil;
import mx.unam.ciencias.is.modelo.Alumno;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author roberto
 */
public class AlumnoDAO {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    /**
   * Añade un nuevo alumno
   *
   * @param alumnoNuevo El alumno a añadir a la BD
   */
  public void crear(Alumno alumnoNuevo) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      session.persist(alumnoNuevo);

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
   * Obtiene un alumno
   *
   * @param correoAlumno El correo que identifica al alumno que se desea
   * obtener de la BD
   * @return El alumno identificado por el correo, o null si no existe
   */
  public Alumno obtener(String correoAlumno) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    Alumno alumnoObtenido = null;
    try {
      tx = session.beginTransaction();

      String queryString = "from Alumno a where a.correo=:c";
      Query query = session.createQuery(queryString);
      query.setParameter("c", correoAlumno);

      alumnoObtenido = (Alumno) query.uniqueResult();

      tx.commit();

    } catch (HibernateException e) {
      if (tx != null) {
        tx.rollback();
      }
      e.printStackTrace();
    } finally {
      session.close();
    }
    return alumnoObtenido;
  }

  /**
   * Actualiza un alumno
   *
   * @param alumnoActualizado Un alumno previamente obtenido con
   * {@link #obtener(java.lang.String) obtener}
   */
  public void actualizar(Alumno alumnoActualizado) {
    Session session = sessionFactory.openSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();

      session.merge(alumnoActualizado);

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

    public Alumno encuentra(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
