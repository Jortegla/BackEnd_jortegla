
package com.portfolio.jortegla.repository;

import com.portfolio.jortegla.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>{
    
}
