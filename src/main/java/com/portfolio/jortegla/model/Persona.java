
package com.portfolio.jortegla.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String titulo;
    
    @NotNull
    private String foto;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String descripcion;
    
    
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String foto, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
    }
    
    
}
