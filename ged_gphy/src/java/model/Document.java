package model;
// Generated 2 oct. 2013 17:01:31 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Document generated by hbm2java
 */
public class Document  implements java.io.Serializable {


     private Integer idDoc;
     private String nom;
     private String adressePhysique;
     private String extension;
     private int taille;
     private Set droits = new HashSet(0);
     private Set signataires = new HashSet(0);

    public Document() {
    }

	
    public Document(String nom, String adressePhysique, String extension, int taille) {
        this.nom = nom;
        this.adressePhysique = adressePhysique;
        this.extension = extension;
        this.taille = taille;
    }
    public Document(String nom, String adressePhysique, String extension, int taille, Set droits, Set signataires) {
       this.nom = nom;
       this.adressePhysique = adressePhysique;
       this.extension = extension;
       this.taille = taille;
       this.droits = droits;
       this.signataires = signataires;
    }
   
    public Integer getIdDoc() {
        return this.idDoc;
    }
    
    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdressePhysique() {
        return this.adressePhysique;
    }
    
    public void setAdressePhysique(String adressePhysique) {
        this.adressePhysique = adressePhysique;
    }
    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public int getTaille() {
        return this.taille;
    }
    
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public Set getDroits() {
        return this.droits;
    }
    
    public void setDroits(Set droits) {
        this.droits = droits;
    }
    public Set getSignataires() {
        return this.signataires;
    }
    
    public void setSignataires(Set signataires) {
        this.signataires = signataires;
    }




}

