package com.voisovych.volodymyr.duty_randomizer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Activity")
public class Activity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy="activity")
    private TeamMate teamMate;
}
