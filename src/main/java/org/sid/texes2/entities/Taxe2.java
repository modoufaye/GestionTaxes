package org.sid.texes2.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,length = 3,name = "TYPE")
@Entity
public abstract class Taxe2 implements Serializable{
    @Id @GeneratedValue
    private Long id;
    private String titre;
    private Date date;
    private double montant;
    @ManyToOne
    @JoinColumn(name = "CODE_ENT")
    private Entreprise2 entreprise2;

    public Taxe2() {
        super();
    }

    public Taxe2(String titre, Date date, double montant, Entreprise2 entreprise2) {
        super();
        this.titre = titre;
        this.date = date;
        this.montant = montant;
        this.entreprise2 = entreprise2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Entreprise2 getEntreprise2() {
        return entreprise2;
    }

    public void setEntreprise2(Entreprise2 entreprise2) {
        this.entreprise2 = entreprise2;
    }
    
    
}
