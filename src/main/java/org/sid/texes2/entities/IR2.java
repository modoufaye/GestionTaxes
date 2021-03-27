package org.sid.texes2.entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("IR")
public class IR2 extends Taxe2{

    public IR2() {
        super();
    }

    public IR2(String titre, Date date, double montant, Entreprise2 entreprise2) {
        super(titre, date, montant, entreprise2);
    }
    
}
