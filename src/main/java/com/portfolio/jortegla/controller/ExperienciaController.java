
package com.portfolio.jortegla.controller;

import com.portfolio.jortegla.model.Experiencia;
import com.portfolio.jortegla.service.implementacion.ExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experienciaServ;
    
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return experienciaServ.getExperiencia();
    }
    
   
    @PostMapping(path="/experiencia/crear")
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia){
        experienciaServ.saveExperiencia(experiencia);
        return experiencia;
    }
    
    @DeleteMapping("/experiencia/borrar/{idExp}")
    public void deleteExperiencia(@PathVariable Long idExp){
        experienciaServ.deleteExperiencia(idExp);
        
    }
    
    @PutMapping("/experiencia/editar/{idExp}")
    public Experiencia editExperiencia(@PathVariable Long idExp,@RequestBody Experiencia experiencia){
        experienciaServ.saveExperiencia(experiencia);
        return experiencia;
    }
    
    
   @GetMapping("/experiencia/traer/{idExp}")
   public Experiencia getIdExperiencia(@PathVariable Long idExp){
       Experiencia experiencia = experienciaServ.findExperiencia(idExp);
       return experiencia;
   }
        
        
        
        
    
}
