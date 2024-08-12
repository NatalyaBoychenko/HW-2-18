package org.todolist.hw218.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.todolist.hw218.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
