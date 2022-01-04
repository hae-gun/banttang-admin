package com.hproject.faq.repository;

import com.hproject.faq.entity.Faq;
import com.hproject.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaqRepository extends JpaRepository<Faq, String> {
}
