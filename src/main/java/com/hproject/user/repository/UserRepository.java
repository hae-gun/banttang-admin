package com.hproject.user.repository;

import com.hproject.report.entity.Report;
import com.hproject.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Report, User> {
}
