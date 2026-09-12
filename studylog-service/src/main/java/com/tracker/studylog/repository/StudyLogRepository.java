package com.tracker.studylog.repository;

import com.tracker.studylog.model.StudyLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudyLogRepository extends JpaRepository<StudyLog, Long> {
    List<StudyLog> findByStudentId(Long studentId);
}
