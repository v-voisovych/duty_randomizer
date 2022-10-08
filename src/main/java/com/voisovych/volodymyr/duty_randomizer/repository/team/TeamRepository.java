package com.voisovych.volodymyr.duty_randomizer.repository.team;

import com.voisovych.volodymyr.duty_randomizer.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

    Team findByName(String name);
}
