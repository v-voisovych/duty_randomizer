package com.voisovych.volodymyr.duty_randomizer.repository.teammate;

import com.voisovych.volodymyr.duty_randomizer.model.TeamMate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMateRepository extends CrudRepository<TeamMate, Integer> {

    TeamMate findByFirsNameAndSecondName(String firstName, String secondName);
}
