package com.voisovych.volodymyr.duty_randomizer.service.project;

import com.voisovych.volodymyr.duty_randomizer.model.Project;

public interface ProjectService {

    Project findByName(String name);
}