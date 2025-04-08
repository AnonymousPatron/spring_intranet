package com.luna.repository;

import com.luna.common.AttendanceStatus;
import com.luna.common.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    List<LeaveRequest> findByEmployeeId(Long employeeId);
    List<LeaveRequest> findByManagerIdAndStatus(Long managerId, AttendanceStatus status);
}
