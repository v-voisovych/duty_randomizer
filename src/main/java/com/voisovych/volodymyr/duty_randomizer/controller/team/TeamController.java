package com.voisovych.volodymyr.duty_randomizer.controller.team;

import com.voisovych.volodymyr.duty_randomizer.model.Team;
import com.voisovych.volodymyr.duty_randomizer.service.team.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    @GetMapping("/getAllTeams")
    public ResponseEntity<Iterable<Team>> getAllTeams () {
        return ResponseEntity.ok(service.findAll());
    }

}
