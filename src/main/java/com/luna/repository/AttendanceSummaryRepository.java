package com.luna.repository;

import com.luna.entity.AttendanceStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttendanceSummaryRepository extends JpaRepository<AttendanceStatistics, Long> {
    Optional<AttendanceStatistics> findByMonthAndYear(int month, int year);
}
