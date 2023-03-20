package com.mini.taskmanager.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

public class Status {

    private Long id;

    private String desc;

    private Boolean isFinish;

    private Task task;
}
