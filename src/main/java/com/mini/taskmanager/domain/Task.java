package com.mini.taskmanager.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

public class Task {

    private Long id;

    private String name;

    private String desc;

    private LocalDate DDay;

    private Member member;

    private Status status;

    private List<Comment> comments = new ArrayList<>();

}
