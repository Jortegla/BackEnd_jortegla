
package com.portfolio.jortegla.service.implementacion;

import com.portfolio.jortegla.model.Educacion;
import com.portfolio.jortegla.repository.EducacionRepo;
import com.portfolio.jortegla.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepo educacionRepo;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = educacionRepo.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public void deleteEducacion(Long idEdu) {
        educacionRepo.deleteById(idEdu);
    }

    @Override
    public Educacion findEducacion(Long idEdu) {
        Educacion educacion = educacionRepo.findById(idEdu).orElse(null);
        return educacion;
    }
    
}
