
package com.portfolio.jortegla.service;

import com.portfolio.jortegla.model.Skill;
import java.util.List;


public interface ISkillService {
    
    //Traer Lista de Habilidades
    public List<Skill> getSkill();
    
    //Guardar un objeto de tipo Habilidades
    public void saveSkill(Skill skill);
    
    //Eliminar una habilidad por id
    public void deleteSkill(Long idSk);
    
    //Buscar una Habilidad por id
    public Skill findSkill(Long idSk);
}
