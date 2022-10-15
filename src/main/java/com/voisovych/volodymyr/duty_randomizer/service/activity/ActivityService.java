package com.voisovych.volodymyr.duty_randomizer.service.activity;

import com.voisovych.volodymyr.duty_randomizer.model.Activity;

public interface ActivityService {

    Activity findByName(String name);
    Iterable<Activity> findAll();
}
