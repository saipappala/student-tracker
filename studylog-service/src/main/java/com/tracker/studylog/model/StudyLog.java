package com.tracker.studylog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "study_logs")
@Data
public class StudyLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private String subject;
    private Integer durationMinutes;
    private String learningSummary;
    private LocalDate logDate;
}
