package com.hooria.todo.domain;

import lombok.*;

@Data
@AllArgsConstructor
public class Member {

    private long id;
    private String userId;
    private String name;
    private String password;
}
