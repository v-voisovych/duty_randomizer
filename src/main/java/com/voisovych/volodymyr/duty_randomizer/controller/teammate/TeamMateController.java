package com.voisovych.volodymyr.duty_randomizer.controller.teammate;

import com.voisovych.volodymyr.duty_randomizer.model.TeamMate;
import com.voisovych.volodymyr.duty_randomizer.service.teammate.TeamMateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamMateController {

    private final TeamMateService service;

    public TeamMateController(TeamMateService service) {
        this.service = service;
    }

    @GetMapping("/getAllTeammates")
    public ResponseEntity<Iterable<TeamMate>> getAllTeams () {
        return ResponseEntity.ok(service.findAll());
    }

}
