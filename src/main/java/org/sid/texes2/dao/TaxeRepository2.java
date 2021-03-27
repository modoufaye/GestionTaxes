package org.sid.texes2.dao;

import java.util.List;
import org.sid.texes2.entities.Entreprise2;
import org.sid.texes2.entities.Taxe2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxeRepository2 extends JpaRepository<Taxe2, Long>{
    public List<Taxe2> findByEntreprise2(Entreprise2 e);
}
