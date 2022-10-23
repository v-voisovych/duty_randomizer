package com.voisovych.volodymyr.duty_randomizer.service.project;

import com.voisovych.volodymyr.duty_randomizer.model.Project;
import com.voisovych.volodymyr.duty_randomizer.repository.project.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Project findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Iterable<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public Project save(Project project) {
        return repository.save(project);
    }

    @Override
    public void delete(Project project) {
        repository.delete(project);
    }
}
