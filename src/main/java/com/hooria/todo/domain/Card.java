package com.hooria.todo.domain;

import java.time.LocalDateTime;

public class Card {

    private long id;
    private int status;
    private String title;
    private String content;
    private String userId;
    private int applianceInfo;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean deletedYn;
    private int index;
}
