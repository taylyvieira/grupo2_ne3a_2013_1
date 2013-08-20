/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import br.edu.utfpr.cm.pi.daos;
import javaapplication1.daos.api.Filter;
import javaapplication1.entidades.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author TAYLY
 */
public class HibernateDao implements Dao<Object> {

    @Override
    public void persist(Object o) throws Exception {
        
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        cfg.setProperty("hibernate.connection.user", "aluno");
        cfg.setProperty("hibernate.connection.password", "aluno");
//        cfg.setProperty("hibernate.connection.autocommit", "true");

        cfg.addAnnotatedClass(Pessoa.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction().begin();
        session.persist(o);
        session.beginTransaction().commit();

        session.flush();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void delete(Object o) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        map.put("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        map.put("hibernate.connection.user", "aluno");
        map.put("hibernate.connection.password", "aluno");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySystem", map);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Object o, Connection con) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object retrieve(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> list(String whereClause, String orderClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Object> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//    public static void main(String[] args) throws Exception {
//        Pessoa p = new Pessoa();
//        p.setNome("Hiber");
//        p.setCpf("0000000000");
//        p.setDataNascimento(Calendar.getInstance());
//
//
//        new HibernateDao().persist(p);
//
//        new HibernateDao().delete(p);



    }



    
