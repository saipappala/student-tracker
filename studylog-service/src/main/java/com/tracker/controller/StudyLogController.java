package com.tracker.studylog.controller;

import com.tracker.studylog.model.StudyLog;
import com.tracker.studylog.repository.StudyLogRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class StudyLogController {

    private final StudyLogRepository repository;

    public StudyLogController(StudyLogRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<StudyLog> createLog(@RequestBody StudyLog log) {
        if (log.getLogDate() == null) {
            log.setLogDate(LocalDate.now());
        }
        return ResponseEntity.ok(repository.save(log));
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<StudyLog>> getLogsByStudent(@PathVariable Long studentId) {
        return ResponseEntity.ok(repository.findByStudentId(studentId));
    }
}
