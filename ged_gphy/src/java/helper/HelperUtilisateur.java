/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import model.Utilisateur;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;
@Named(value="HelperUtilisateur")
@ApplicationScoped
/**
 *
 * @author Julien Lavigne
 */

public class HelperUtilisateur {

    Session session = null;

    public HelperUtilisateur () {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    public List helperConnection(Utilisateur user){
 
       Query sqlQuery = session.createSQLQuery("Select * from utilisateur where login="+user.getLogin()+"password"+user.getPassword());
       List<Utilisateur> List_user = sqlQuery.list();
       return List_user;
       
   }

}
