package com.voisovych.volodymyr.duty_randomizer.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "team_mate")
public class TeamMate {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "team_id", insertable = false, updatable = false)
    private int teamId;

    @Column(name = "activity_id", insertable = false, updatable = false)
    private int activityId;

    @Column(name = "firs_name")
    private String firsName;

    @Column(name = "second_name")
    private String secondName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "activity_id", referencedColumnName = "id")
    private Activity activity;

}
