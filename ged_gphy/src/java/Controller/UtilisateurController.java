/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Utilisateur;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.*;

/**
 *
 * @author Julien Lavigne
 */
public class UtilisateurController {
    
    private Utilisateur user;
   
    public UtilisateurController(Utilisateur user)
    {
        this.user=user;
    }
   public void connection(){
       Session session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
      
       Query sqlQuery = session.createSQLQuery("Select * from utilisateur where login="+user.getLogin()+"password"+user.getPassword());
       List<Utilisateur> List_user = sqlQuery.list();
       user=List_user.get(0);
       
       FacesContext context = FacesContext.getCurrentInstance();
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Validé", "Login: "+user.getLogin()+" Prénom : "+user.getPrenom()+"Nom :"+user.getNom()));
        
       session.close();
   }
   
    
    
    
}
