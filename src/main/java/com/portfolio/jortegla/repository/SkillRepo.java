
package com.portfolio.jortegla.repository;

import com.portfolio.jortegla.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long>{
    
}
