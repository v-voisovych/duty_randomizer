package com.voisovych.volodymyr.duty_randomizer.controller.project;

import com.voisovych.volodymyr.duty_randomizer.model.Project;
import com.voisovych.volodymyr.duty_randomizer.service.project.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/getAllProjects")
    public ResponseEntity<Iterable<Project>> getAllTeams () {
        return ResponseEntity.ok(service.findAll());
    }

}