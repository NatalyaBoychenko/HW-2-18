package org.todolist.hw218.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.todolist.hw218.model.dto.*;
import org.todolist.hw218.service.NoteService;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    public CreateNoteResponse create(@RequestBody CreateNoteRequest request) {
        return noteService.create(request);
    }

    @GetMapping
    public GetNotesResponse getUserNotes() {
        return noteService.getNotes();
    }

    @PatchMapping
    public UpdateNoteResponse update(@RequestBody UpdateNoteRequest request) {
        return noteService.update(request);
    }

    @DeleteMapping
    public DeleteNoteResponse delete(@RequestParam(name = "id") long id) {
        return noteService.delete(id);
    }

}
