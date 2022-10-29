
package com.portfolio.jortegla.repository;

import com.portfolio.jortegla.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long>{
    
}
