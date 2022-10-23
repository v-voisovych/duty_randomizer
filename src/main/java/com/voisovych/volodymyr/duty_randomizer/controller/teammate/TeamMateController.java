package com.voisovych.volodymyr.duty_randomizer.controller.teammate;

import com.voisovych.volodymyr.duty_randomizer.model.TeamMate;
import com.voisovych.volodymyr.duty_randomizer.service.teammate.TeamMateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teammate")
public class TeamMateController {

    private final TeamMateService service;

    public TeamMateController(TeamMateService service) {
        this.service = service;
    }

    @GetMapping("/getAllTeammates")
    public ResponseEntity<Iterable<TeamMate>> getAllTeams() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findByFirsNameAndSecondName")
    public ResponseEntity<TeamMate> findByFirsNameAndSecondName(@RequestParam("firsName") String firsName, @RequestParam("secondName") String secondName) {
        return ResponseEntity.ok(service.findByFirsNameAndSecondName(firsName, secondName));
    }

    @PostMapping("/saveTeamMate")
    public ResponseEntity<TeamMate> saveTeamMate(@RequestBody TeamMate teamMate) {
        return ResponseEntity.ok(service.save(teamMate));
    }

    @DeleteMapping("/deleteTeamMate")
    public ResponseEntity<String> deleteActivity(@RequestBody TeamMate teamMate) {
        service.delete(teamMate);
        return ResponseEntity.ok(String.format("TeamMate: %s deleted", teamMate));
    }

}
