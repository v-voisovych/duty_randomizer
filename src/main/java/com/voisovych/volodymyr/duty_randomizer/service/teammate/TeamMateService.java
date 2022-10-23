package com.voisovych.volodymyr.duty_randomizer.service.teammate;

import com.voisovych.volodymyr.duty_randomizer.model.TeamMate;

public interface TeamMateService {

    TeamMate findByFirsNameAndSecondName(String firstName, String secondName);

    Iterable<TeamMate> findAll();

    TeamMate save(TeamMate teamMate);

    void delete(TeamMate teamMate);
}
