
package com.portfolio.jortegla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSk;
    private String nombreSk;
    private String imagenSk;
    private int porcentajeSk;

    public Skill() {
    }

    public Skill(Long idSk, String nombreSk, String imagenSk, int porcentajeSk) {
        this.idSk = idSk;
        this.nombreSk = nombreSk;
        this.imagenSk = imagenSk;
        this.porcentajeSk = porcentajeSk;
    }

    
    
    
    
}
