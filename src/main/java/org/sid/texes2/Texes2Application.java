package org.sid.texes2;

import java.util.Date;
import org.sid.texes2.dao.EntrepriseRepository2;
import org.sid.texes2.dao.TaxeRepository2;
import org.sid.texes2.entities.Entreprise2;
import org.sid.texes2.entities.IR2;
import org.sid.texes2.entities.TVA2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Texes2Application implements CommandLineRunner{
    @Autowired
    private EntrepriseRepository2 entrepriseRepository;
    @Autowired
    private TaxeRepository2 taxeRepository;
	public static void main(String[] args) {
		SpringApplication.run(Texes2Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Entreprise2 e1 = entrepriseRepository.save(new Entreprise2("R1", "r1@gmail.com", "SARL"));
        Entreprise2 e2 = entrepriseRepository.save(new Entreprise2("R2", "r2@gmail.com", "INFORMELLE"));
        Entreprise2 e3 = entrepriseRepository.save(new Entreprise2("R3", "r3@gmail.com", "SARL"));
        
        Entreprise2 e4 = entrepriseRepository.save(new Entreprise2("R4", "r4@gmail.com", "SARL"));
        Entreprise2 e5 = entrepriseRepository.save(new Entreprise2("R1", "r5@gmail.com", "INFORMELLE"));
        Entreprise2 e6 = entrepriseRepository.save(new Entreprise2("R6", "r6@gmail.com", "SARL"));
        
        Entreprise2 e7 = entrepriseRepository.save(new Entreprise2("R7", "r7@gmail.com", "SARL"));
        Entreprise2 e8 = entrepriseRepository.save(new Entreprise2("R8", "r8@gmail.com", "INFORMELLE"));
        Entreprise2 e9 = entrepriseRepository.save(new Entreprise2("R9", "r9@gmail.com", "SARL"));
        
        Entreprise2 e10 = entrepriseRepository.save(new Entreprise2("R1", "r10@gmail.com", "SARL"));
        Entreprise2 e11 = entrepriseRepository.save(new Entreprise2("R11", "r11@gmail.com", "INFORMELLE"));
        Entreprise2 e12 = entrepriseRepository.save(new Entreprise2("R12", "r612@gmail.com", "SARL"));
        
        taxeRepository.save(new TVA2("HABITATION", new Date(), 9000, e1));
        taxeRepository.save(new TVA2("Voiture", new Date(), 8000, e1));
        taxeRepository.save(new IR2("IR 216", new Date(), 7000, e2));
        taxeRepository.save(new IR2("IR 2019", new Date(), 6000, e3));
        
        taxeRepository.save(new TVA2("Boutique", new Date(), 11000, e4));
        taxeRepository.save(new TVA2("Agence", new Date(), 22000, e5));
        taxeRepository.save(new IR2("IR 2017", new Date(), 750, e6));
        taxeRepository.save(new IR2("IR 2020", new Date(), 650, e7));
    }

}
