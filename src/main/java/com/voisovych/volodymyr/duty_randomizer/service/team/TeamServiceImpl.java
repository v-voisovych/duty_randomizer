package com.voisovych.volodymyr.duty_randomizer.service.team;

import com.voisovych.volodymyr.duty_randomizer.model.Team;
import com.voisovych.volodymyr.duty_randomizer.repository.team.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository repository;

    public TeamServiceImpl(TeamRepository repository) {
        this.repository = repository;
    }

    @Override
    public Team findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Iterable<Team> findAll() {
        return repository.findAll();
    }

    @Override
    public Team save(Team team) {
        return repository.save(team);
    }

    @Override
    public void delete(Team team) {
        repository.delete(team);
    }
}
