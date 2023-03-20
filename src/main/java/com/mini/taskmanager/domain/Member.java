package com.mini.taskmanager.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

public class Member {

    private Long id;

    private String name;

    private List<Task> tasks = new ArrayList<>();

    private List<Comment> comments = new ArrayList<>();
}
