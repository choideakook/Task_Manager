package com.mini.taskmanager.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Status {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "status_id")
    private Long id;

    private String desc;

    private Boolean isFinish;

    @OneToOne(mappedBy = "status")
    private Task task;
}