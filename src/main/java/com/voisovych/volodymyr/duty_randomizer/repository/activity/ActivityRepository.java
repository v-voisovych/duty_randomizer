package com.voisovych.volodymyr.duty_randomizer.repository.activity;

import com.voisovych.volodymyr.duty_randomizer.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Integer> {

    Activity findByName(String name);
}
