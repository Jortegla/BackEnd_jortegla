
package com.portfolio.jortegla.service.implementacion;

import com.portfolio.jortegla.model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.jortegla.repository.SkillRepo;
import com.portfolio.jortegla.service.ISkillService;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepo skillRepo;

    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = skillRepo.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long idSk) {
        skillRepo.deleteById(idSk);
    }

    @Override
    public Skill findSkill(Long idSk) {
        Skill skill = skillRepo.findById(idSk).orElse(null);
        return skill;
    }
    
    
}
