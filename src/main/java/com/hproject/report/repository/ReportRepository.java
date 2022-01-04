package com.hproject.report.repository;

import com.hproject.report.entity.Report;
import com.hproject.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, String> {
}
