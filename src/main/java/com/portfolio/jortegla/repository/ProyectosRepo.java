
package com.portfolio.jortegla.repository;

import com.portfolio.jortegla.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository<Proyectos, Long>{
    
}
