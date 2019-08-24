package com.danjrosales.pmm.serviceimpl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.danjrosales.pmm.entities.ProjectManager;
import com.danjrosales.pmm.repository.ProjectManagerRepository;
import com.danjrosales.pmm.service.ProjectManagerService;

public class ProjectManagerServiceImpl implements ProjectManagerService {

	@Autowired
	ProjectManagerRepository projectManagerRepository;
	
	@Override
	public List<ProjectManager> getAll() {
		// TODO Auto-generated method stub
		return projectManagerRepository.findAll();
	}

	@Override
	public ProjectManager getProjectManager(int id) {
		// TODO Auto-generated method stub
		return projectManagerRepository.getOne(id);
	}

	@Override
	public ProjectManager createProjectManager(ProjectManager projectManager) {
		
		return null ;
	}

	@Override
	public Response updateProjectManager(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteProjectManager(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
