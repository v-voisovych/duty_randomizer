package com.voisovych.volodymyr.duty_randomizer.service.activity;

import com.voisovych.volodymyr.duty_randomizer.model.Activity;
import com.voisovych.volodymyr.duty_randomizer.repository.activity.ActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository repository;

    public ActivityServiceImpl(ActivityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Activity findByName(String name) {
        return repository.findByName(name);
    }
}
