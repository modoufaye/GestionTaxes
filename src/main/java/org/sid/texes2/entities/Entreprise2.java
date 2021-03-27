package org.sid.texes2.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Entreprise2 implements Serializable{
    @Id @GeneratedValue
    private Long code;
    @NotNull
    @Size(min=2, max=20)
    private String nom;
    @NotNull
    @Email(message = "Votre adresse email n'est pas valide")
    private String email;
    @NotNull
    @Size(min=2, max=30)
    private String raisonSociale;
    @OneToMany(mappedBy = "entreprise2")
    private Collection<Taxe2> taxes2;

    public Entreprise2(){
        super();
    }

    public Entreprise2(String nom, String email, String raisonSociale) {
        super();
        this.nom = nom;
        this.email = email;
        this.raisonSociale = raisonSociale;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Collection<Taxe2> getTaxes2() {
        return taxes2;
    }

    public void setTaxes2(Collection<Taxe2> taxes2) {
        this.taxes2 = taxes2;
    }
        
}
