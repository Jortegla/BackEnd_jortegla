
package com.portfolio.jortegla.service.implementacion;

import com.portfolio.jortegla.model.Persona;
import com.portfolio.jortegla.repository.PersonaRepo;
import com.portfolio.jortegla.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
       
    @Autowired
    private PersonaRepo personaRepo;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = personaRepo.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
    
       
    
}
