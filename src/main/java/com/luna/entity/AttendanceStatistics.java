package com.luna.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Month;
import java.time.YearMonth;

@Entity
@Table(name = "attendance_statistics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttendanceStatistics {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private int year;
    private int month;

    private int lateCount;
    private int absentCount;
    private int businessTripCount; // 외근
    private int vacationCount;

}

