package model;
// Generated 7 oct. 2013 18:10:30 by Hibernate Tools 3.2.1.GA



/**
 * SignataireId generated by hbm2java
 */
public class SignataireId  implements java.io.Serializable {


     private int idDoc;
     private String login;

    public SignataireId() {
    }

    public SignataireId(int idDoc, String login) {
       this.idDoc = idDoc;
       this.login = login;
    }
   
    public int getIdDoc() {
        return this.idDoc;
    }
    
    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SignataireId) ) return false;
		 SignataireId castOther = ( SignataireId ) other; 
         
		 return (this.getIdDoc()==castOther.getIdDoc())
 && ( (this.getLogin()==castOther.getLogin()) || ( this.getLogin()!=null && castOther.getLogin()!=null && this.getLogin().equals(castOther.getLogin()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdDoc();
         result = 37 * result + ( getLogin() == null ? 0 : this.getLogin().hashCode() );
         return result;
   }   


}


