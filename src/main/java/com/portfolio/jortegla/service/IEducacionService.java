
package com.portfolio.jortegla.service;

import com.portfolio.jortegla.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    //Traer Lista de Educacion
    public List<Educacion> getEducacion();
    
    //Guardar un objeto de tipo Educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar una educacion por id
    public void deleteEducacion(Long idEdu);
    
    //Buscar una educacion por id
    public Educacion findEducacion(Long idEdu);
}
