package com.hooria.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class ActivityLog {

    private long id;
    private String userId;
    private int activityType;
    private int fromStatus;
    private int toStatus;
    private LocalDateTime createdDate;
    private boolean readYn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityLog that = (ActivityLog) o;
        return id == that.id && activityType == that.activityType && fromStatus == that.fromStatus && toStatus == that.toStatus && readYn == that.readYn && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, activityType, fromStatus, toStatus, readYn);
    }
}
