
package com.portfolio.jortegla.service;

import com.portfolio.jortegla.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    //Traer Lista de Proyectos
    public List<Proyectos> getProyectos();
    
    //Guardar un objeto de tipo proyecto
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar un proyecto por id
    public void deleteProyectos(Long idProy);
    
    //Buscar un proyecto por id
    public Proyectos findProyectos(Long idProy);
}
