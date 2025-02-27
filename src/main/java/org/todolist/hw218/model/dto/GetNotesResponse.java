package org.todolist.hw218.model.dto;

import lombok.Builder;
import lombok.Data;
import org.todolist.hw218.model.Note;

import java.util.List;

@Builder
@Data
public class GetNotesResponse {
    private Error error;

    private List<Note> userNotes;

    public enum Error {
        ok
    }

    public static GetNotesResponse success(List<Note> userNotes) {
        return builder().error(Error.ok).userNotes(userNotes).build();
    }

    public static GetNotesResponse failed(Error error) {
        return builder().error(error).userNotes(null).build();
    }
}
