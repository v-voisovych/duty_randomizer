package com.voisovych.volodymyr.duty_randomizer.controller.activity;

import com.voisovych.volodymyr.duty_randomizer.model.Activity;
import com.voisovych.volodymyr.duty_randomizer.service.activity.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    private final ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @GetMapping("/getAllActivity")
    public ResponseEntity<Iterable<Activity>> getAllTeams () {
        return ResponseEntity.ok(service.findAll());
    }

}
