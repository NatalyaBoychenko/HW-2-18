package org.todolist.hw218.model.dto;

import lombok.Data;

@Data
public class UpdateNoteRequest {
    private long id;
    private String title;
    private String content;
}
