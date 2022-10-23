package com.voisovych.volodymyr.duty_randomizer.controller.team;

import com.voisovych.volodymyr.duty_randomizer.model.Team;
import com.voisovych.volodymyr.duty_randomizer.service.team.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    @GetMapping("/getAllTeams")
    public ResponseEntity<Iterable<Team>> getAllTeams() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findTeamByName")
    public ResponseEntity<Team> findTeamByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @PostMapping("/saveTeam")
    public ResponseEntity<Team> saveTeam(@RequestBody Team team) {
        return ResponseEntity.ok(service.save(team));
    }

    @DeleteMapping("/deleteTeam")
    public ResponseEntity<String> deleteActivity(@RequestBody Team team) {
        service.delete(team);
        return ResponseEntity.ok(String.format("Team: %s deleted", team));
    }

}
