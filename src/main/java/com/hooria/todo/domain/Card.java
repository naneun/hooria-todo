package com.hooria.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Card {

    private long id;
    private int status;
    private String title;
    private String content;
    private String userId;
    private int applianceInfo;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private boolean deletedYn;
    private int index;
}
