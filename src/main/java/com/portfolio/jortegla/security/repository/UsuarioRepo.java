
package com.portfolio.jortegla.security.repository;

import com.portfolio.jortegla.security.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUsername(String username);
}
