
package com.portfolio.jortegla.controller;

import com.portfolio.jortegla.model.Educacion;
import com.portfolio.jortegla.service.implementacion.EducacionService;
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

@CrossOrigin(origins = "*")
@RestController

public class EducacionController {
    
    @Autowired
    EducacionService educacionServ;
    
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){
        return educacionServ.getEducacion();
    }
           
    @PostMapping("/educacion/crear")
    public Educacion createEducacion(@RequestBody Educacion educacion){
        educacionServ.saveEducacion(educacion);
        return educacion;
    }
    
    @DeleteMapping("/educacion/borrar/{idEdu}")
    public void deleteEducacion(@PathVariable Long idEdu){
        educacionServ.deleteEducacion(idEdu);
    }
        
    @PutMapping("/educacion/editar/{idEdu}")
    public Educacion editEducacion(@PathVariable Long idEdu, @RequestBody Educacion educacion){
        educacionServ.saveEducacion(educacion);
        return educacion;
    }
    
    @GetMapping("/educacion/traer/{idEdu}")
    public Educacion findEducacion(@PathVariable Long idEdu) {
        Educacion educacion = educacionServ.findEducacion(idEdu);
        return educacion;
    }
}