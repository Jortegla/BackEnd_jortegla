
package com.portfolio.jortegla.service.implementacion;

import com.portfolio.jortegla.model.Proyectos;
import com.portfolio.jortegla.repository.ProyectosRepo;
import com.portfolio.jortegla.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    private ProyectosRepo proyectosRepo;

    @Override
    public List<Proyectos> getProyectos() {
       List<Proyectos> proyectos = proyectosRepo.findAll();
       return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        proyectosRepo.save(proyectos);
    }

    @Override
    public void deleteProyectos(Long idProy) {
        proyectosRepo.deleteById(idProy);
    }

    @Override
    public Proyectos findProyectos(Long idProy) {
        Proyectos proyectos = proyectosRepo.findById(idProy).orElse(null);
        return proyectos;
    }
    
    
    
}
