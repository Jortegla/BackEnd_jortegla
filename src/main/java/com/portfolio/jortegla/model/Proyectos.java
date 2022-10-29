
package com.portfolio.jortegla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProy;
    private String nombreProy;
    private int fechaProy;
    private String descripcionProy;
    private String fotoProy;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String nombreProy, int fechaProy, String descripcionProy, String fotoProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.fechaProy = fechaProy;
        this.descripcionProy = descripcionProy;
        this.fotoProy = fotoProy;
    }
    
    
}
