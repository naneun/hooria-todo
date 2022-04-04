package com.hooria.todo.domain;

import java.time.LocalDateTime;

public class ActivityLog {

    private long id;
    private String userId;
    private int activityType;
    private int formStatus;
    private int toStatus;
    private LocalDateTime createdDate;
    private boolean readYn;
}
