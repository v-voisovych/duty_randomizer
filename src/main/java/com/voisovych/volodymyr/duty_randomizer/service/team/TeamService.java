package com.voisovych.volodymyr.duty_randomizer.service.team;

import com.voisovych.volodymyr.duty_randomizer.model.Team;

public interface TeamService {

    Team findByName(String name);
}
