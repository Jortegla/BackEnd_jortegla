
package com.portfolio.jortegla.controller;

import com.portfolio.jortegla.model.Skill;
import com.portfolio.jortegla.service.implementacion.SkillService;
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

@RestController
@CrossOrigin(origins = "*")
public class SkillController {
    
    @Autowired
    SkillService skillServ;
    
    @GetMapping("/skills/traer")
    public List<Skill> getSkill(){
        return skillServ.getSkill();
    }
    
    @PostMapping("/skills/crear")
    public Skill createSkill(@RequestBody Skill skill){
        skillServ.saveSkill(skill);
        return skill;
    }
    
    @DeleteMapping("/skills/borrar/{idSk}")
    public void deleteSkill(@PathVariable Long idSk){
        skillServ.deleteSkill(idSk);
        
    }
    
    @PutMapping("/skills/editar/{idSk}")
    public Skill editSkill(@PathVariable Long idSk, @RequestBody Skill skill){
        skillServ.saveSkill(skill);
        return skill;
    }
    
    @GetMapping("/skills/traer/{idSk}")
    public Skill findIdSkill(@PathVariable Long idSk){
        Skill skill = skillServ.findSkill(idSk);
        return skill;
    }
}
