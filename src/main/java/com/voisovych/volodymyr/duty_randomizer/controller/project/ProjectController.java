package com.voisovych.volodymyr.duty_randomizer.controller.project;

import com.voisovych.volodymyr.duty_randomizer.model.Project;
import com.voisovych.volodymyr.duty_randomizer.service.project.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/getAllProjects")
    public ResponseEntity<Iterable<Project>> getAllTeams() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findProjectByName")
    public ResponseEntity<Project> findProjectByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @PostMapping("/saveProject")
    public ResponseEntity<Project> saveProject(@RequestBody Project project) {
        return ResponseEntity.ok(service.save(project));
    }

    @DeleteMapping("/deleteProject")
    public ResponseEntity<String> deleteProject(@RequestBody Project project) {
        service.delete(project);
        return ResponseEntity.ok(String.format("Project: %s deleted", project));
    }

}