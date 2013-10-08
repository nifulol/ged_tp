

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julien Lavigne
 */
package model;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;



/**
 *
 * @author Julien Lavigne
 */
@Named
@SessionScoped
public class UtilisateurController implements Serializable {

    
    private Utilisateur user;
    private HelperUtilisateur session;
   
    public UtilisateurController()
    {
        this.user= new Utilisateur();
        session = new HelperUtilisateur();
    }
   public String connection(){
       
       
       List<Utilisateur> users= session.getUser(user);
       user = users.get(0);
       
       /*FacesContext context = FacesContext.getCurrentInstance();
       context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Validé", "Login: "+user.getLogin()+" Prénom : "+user.getPrenom()+"Nom :"+user.getNom()));
        */
       return "index";
   }
   
       public Utilisateur getUtilisateur() {
        return user;
    }

    public void setUtilisateur(Utilisateur user) {
        this.user = user;
   
    }   
}
