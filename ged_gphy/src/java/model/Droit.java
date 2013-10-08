package model;
// Generated 7 oct. 2013 18:10:30 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Droit generated by hbm2java
 */
public class Droit  implements java.io.Serializable {


     private Integer idDroit;
     private String nom;
     private Set<TableDroit> tableDroits = new HashSet<TableDroit>(0);

    public Droit() {
    }

	
    public Droit(String nom) {
        this.nom = nom;
    }
    public Droit(String nom, Set<TableDroit> tableDroits) {
       this.nom = nom;
       this.tableDroits = tableDroits;
    }
   
    public Integer getIdDroit() {
        return this.idDroit;
    }
    
    public void setIdDroit(Integer idDroit) {
        this.idDroit = idDroit;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set<TableDroit> getTableDroits() {
        return this.tableDroits;
    }
    
    public void setTableDroits(Set<TableDroit> tableDroits) {
        this.tableDroits = tableDroits;
    }




}


