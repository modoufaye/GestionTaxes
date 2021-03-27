package org.sid.texes2.dao;

import org.sid.texes2.entities.Entreprise2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntrepriseRepository2 extends JpaRepository<Entreprise2, Long>{
    @Query("Select e from Entreprise2 e where e.nom like :x")
    public Page<Entreprise2> chercher(@Param("x")String e, Pageable pageable);
}
