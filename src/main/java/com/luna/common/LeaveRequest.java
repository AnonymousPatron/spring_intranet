package com.luna.common;

import com.luna.entity.Employee;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne @JoinColumn(name = "manager_id")
    private Employee manager;

    private LocalDate startDate;
    private LocalDate endDate;

    @Lob
    private String reason;

    @Enumerated(EnumType.STRING)
    private Status status;

}
