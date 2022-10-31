
package com.portfolio.jortegla.controller;

import com.portfolio.jortegla.model.Persona;
import com.portfolio.jortegla.service.implementacion.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")

public class PersonaController {
    
    @Autowired
    PersonaService personaServ;
    
    @GetMapping("/persona/traer")
    public List<Persona> getPersona(){
        return personaServ.getPersona();
    }
    
    @PostMapping("/persona/crear")
    public Persona createPersona(@RequestBody Persona persona){
        personaServ.savePersona(persona);
        return persona;
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        personaServ.deletePersona(id);
        
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestBody Persona persona){
        personaServ.savePersona(persona);
        return persona;
    }
    
   @GetMapping("/persona/traer/{id}")
    public Persona findPersona(@PathVariable Long id){
        Persona persona = personaServ.findPersona(id);
        return persona;
    }
    
    
}
