
package com.portfolio.jortegla.security.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
@Table(name = "roles")
public class Rol {
    
    @Id
    private Long rolId;
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "usuario")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    public Rol() {
    }

    public Rol(Long rolId, String nombre) {
        this.rolId = rolId;
        this.nombre = nombre;
    }
    
    
}
