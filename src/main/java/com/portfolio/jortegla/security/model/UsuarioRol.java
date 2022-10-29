
package com.portfolio.jortegla.security.model;

import com.portfolio.jortegla.security.model.Rol;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class UsuarioRol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    
    @ManyToOne
    private Rol rol;

    public UsuarioRol() {
    }

    public UsuarioRol(Long usuarioRolId, Usuario usuario, Rol rol) {
        this.usuarioRolId = usuarioRolId;
        this.usuario = usuario;
        this.rol = rol;
    }
    
}
