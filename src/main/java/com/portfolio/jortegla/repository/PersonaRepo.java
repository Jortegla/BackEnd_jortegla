
package com.portfolio.jortegla.repository;

import com.portfolio.jortegla.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long>{
    
}
