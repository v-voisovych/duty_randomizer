package com.voisovych.volodymyr.duty_randomizer.service.teammate;

import com.voisovych.volodymyr.duty_randomizer.model.TeamMate;
import com.voisovych.volodymyr.duty_randomizer.repository.teammate.TeamMateRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamMateServiceImpl implements TeamMateService {

    private final TeamMateRepository repository;

    public TeamMateServiceImpl(TeamMateRepository repository) {
        this.repository = repository;
    }

    @Override
    public TeamMate findByFirsNameAndSecondName(String firstName, String secondName) {
        return repository.findByFirsNameAndSecondName(firstName, secondName);
    }

    @Override
    public Iterable<TeamMate> findAll() {
        return repository.findAll();
    }
}
