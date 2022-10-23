package com.voisovych.volodymyr.duty_randomizer.controller.activity;

import com.voisovych.volodymyr.duty_randomizer.model.Activity;
import com.voisovych.volodymyr.duty_randomizer.service.activity.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @GetMapping("/getAllActivity")
    public ResponseEntity<Iterable<Activity>> getAllTeams() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findActivityByName")
    public ResponseEntity<Activity> findActivityByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @PostMapping("/saveActivity")
    public ResponseEntity<Activity> saveActivity(@RequestBody Activity activity) {
        return ResponseEntity.ok(service.save(activity));
    }

    @DeleteMapping("/deleteActivity")
    public ResponseEntity<String> deleteActivity(@RequestBody Activity activity) {
        service.delete(activity);
        return ResponseEntity.ok(String.format("Activity: %s deleted", activity));
    }
}
