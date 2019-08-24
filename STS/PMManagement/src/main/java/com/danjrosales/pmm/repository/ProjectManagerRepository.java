package com.danjrosales.pmm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.danjrosales.pmm.entities.ProjectManager;

@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager, Integer> {

}
