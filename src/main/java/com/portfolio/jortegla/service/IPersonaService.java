
package com.portfolio.jortegla.service;

import com.portfolio.jortegla.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer Lista de Persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
    
}
