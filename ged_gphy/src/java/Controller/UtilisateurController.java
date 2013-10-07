

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julien Lavigne
 */



package Controller;
import helper.HelperUtilisateur;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.Utilisateur;
import org.hibernate.Query;
import org.hibernate.Session;
import util.*;


/**
 *
 * @author Julien Lavigne
 */
@Named(value="UtilisateurController")
@ApplicationScoped
public class UtilisateurController {

    
    private Utilisateur user;
    HelperUtilisateur session;
   
    public UtilisateurController()
    {
        this.user= new Utilisateur();
        session = new HelperUtilisateur();
    }
   public String connection(){
       
       List<Utilisateur> List_user = session.helperConnection(user);
       user=List_user.get(0);
       
       FacesContext context = FacesContext.getCurrentInstance();
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Validé", "Login: "+user.getLogin()+" Prénom : "+user.getPrenom()+"Nom :"+user.getNom()));
        
       return "index";
   }
   
       public Utilisateur getUtilisateur() {
        return user;
    }

    public void setUtilisateur(Utilisateur user) {
        this.user = user;
   
    }   
}
