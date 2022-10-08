package com.voisovych.volodymyr.duty_randomizer.repository.project;

import com.voisovych.volodymyr.duty_randomizer.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

    Project findByName(String name);
}