
package com.portfolio.jortegla.service;

import com.portfolio.jortegla.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    //Traer Lista de Experiencia
    public List<Experiencia> getExperiencia();
    
    //Guardar una experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar una experiencia por id
    public void deleteExperiencia(Long idExp);
    
    //Buscar una experiencia por id
    public Experiencia findExperiencia(Long idExp);
}
