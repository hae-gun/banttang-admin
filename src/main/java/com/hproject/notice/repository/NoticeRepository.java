package com.hproject.notice.repository;

import com.hproject.notice.entity.Notice;
import com.hproject.report.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, String> {
}
