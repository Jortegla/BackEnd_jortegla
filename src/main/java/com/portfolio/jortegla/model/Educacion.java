
package com.portfolio.jortegla.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    
    private String tituloEdu;
    private String institutoEdu;
    private String lugarEdu;
    private String estadoEdu;
    private int fechaEdu;
    private String logoEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String institutoEdu, String lugarEdu, String estadoEdu, int fechaEdu, String logoEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.institutoEdu = institutoEdu;
        this.lugarEdu = lugarEdu;
        this.estadoEdu = estadoEdu;
        this.fechaEdu = fechaEdu;
        this.logoEdu = logoEdu;
    }

    

    
    
    
    
    
}
