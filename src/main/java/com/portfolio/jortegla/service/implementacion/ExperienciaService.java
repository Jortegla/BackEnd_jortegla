
package com.portfolio.jortegla.service.implementacion;

import com.portfolio.jortegla.model.Experiencia;
import com.portfolio.jortegla.repository.ExperienciaRepo;
import com.portfolio.jortegla.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    private ExperienciaRepo experienciaRepo;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = experienciaRepo.findAll();
        return experiencia; 
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
       experienciaRepo.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long idExp) {
        experienciaRepo.deleteById(idExp);
    }

    @Override
    public Experiencia findExperiencia(Long idExp) {
        Experiencia experiencia = experienciaRepo.findById(idExp).orElse(null);
        return experiencia;
    }
    
}
