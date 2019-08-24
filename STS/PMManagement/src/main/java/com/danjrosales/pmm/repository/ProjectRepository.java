package com.danjrosales.pmm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danjrosales.pmm.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
