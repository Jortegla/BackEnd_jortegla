
package com.portfolio.jortegla.controller;

import com.portfolio.jortegla.model.Proyectos;
import com.portfolio.jortegla.service.implementacion.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ProyectosController {
    
    @Autowired
    ProyectosService proyectosServ;
    
    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyectos(){
        return proyectosServ.getProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public Proyectos createProyectos(@RequestBody Proyectos proyectos){
        proyectosServ.saveProyectos(proyectos);
        return proyectos;
    }
    
    @DeleteMapping("/proyectos/borrar/{idProy}")
    public void deleteProyectos(@PathVariable Long idProy){
        proyectosServ.deleteProyectos(idProy);
       
    }
    
    @PutMapping("/proyectos/editar/{idProy}")
    public Proyectos editProyectos(@PathVariable Long idProy,
                                 @RequestParam ("nombreProy") String nuevoNombreProy,
                                 @RequestParam ("fechaProy") int nuevaFechaProy,
                                 @RequestParam ("descripcionProy") String nuevaDescripcionProy,
                                 @RequestParam ("fotoProy") String nuevaFotoProy){
        
        Proyectos proyectos = proyectosServ.findProyectos(idProy);
        
        proyectos.setNombreProy(nuevoNombreProy);
        proyectos.setFechaProy(nuevaFechaProy);
        proyectos.setDescripcionProy(nuevaDescripcionProy);
        proyectos.setFotoProy(nuevaFotoProy);
        
        proyectosServ.saveProyectos(proyectos);
        return proyectos;
    }
    
    @GetMapping("/proyectos/traer/{idProy}")
    public Proyectos findProyectos(@PathVariable Long idProy) {
        Proyectos proyectos = proyectosServ.findProyectos(idProy);
        return proyectos;
}
    
    
}
