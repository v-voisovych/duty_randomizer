package com.voisovych.volodymyr.duty_randomizer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="TeamMate")
public class TeamMate {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "teamId")
    private int teamId;

    @Column(name = "activityId")
    private int activityId;

    @Column(name = "firsName")
    private String firsName;

    @Column(name = "secondName")
    private String secondName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId", referencedColumnName = "id")
    @Transient
    private Team team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "activityId", referencedColumnName = "id")
    @Transient
    private Activity activity;
}
