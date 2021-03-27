package org.sid.texes2.entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("TVA")
public class TVA2 extends Taxe2{

    public TVA2() {
        super();
    }

    public TVA2(String titre, Date date, double montant, Entreprise2 entreprise2) {
        super(titre, date, montant, entreprise2);
    }
    
}
