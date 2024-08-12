package org.todolist.hw218.model.dto;

import lombok.Data;

@Data
public class CreateNoteRequest {
    private String title;
    private String content;
}
