
package com.portfolio.jortegla.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExp;
    private String tituloExp;
    private String nombreExp;
    private int fechaExp;
    private String descripcionExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String nombreExp, int fechaExp, String descripcionExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.nombreExp = nombreExp;
        this.fechaExp = fechaExp;
        this.descripcionExp = descripcionExp;
        this.imagenExp = imagenExp;
    }

    
}
