/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


@Named(value = "HelperUtilisateur")
@SessionScoped
public class HelperUtilisateur implements Serializable {
      Session session = null;

    public HelperUtilisateur() {
    }
    
    public List getUser(Utilisateur user) {
        List<Utilisateur> users = null;
        try {
            session = util.HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Utilisateur");
            users = (List<Utilisateur>) q.list();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    } 
    
}
