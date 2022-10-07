package com.voisovych.volodymyr.duty_randomizer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Team")
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "projectId")
    private int projectId;

    @OneToOne(mappedBy="teamMate")
    private TeamMate teamMate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectId", referencedColumnName = "id")
    @Transient
    private Project project;
}
