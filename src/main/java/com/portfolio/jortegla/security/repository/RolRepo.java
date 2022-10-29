
package com.portfolio.jortegla.security.repository;

import com.portfolio.jortegla.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepo extends JpaRepository<Rol, Long>{
    
}
