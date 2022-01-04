package com.hproject.report.entity;

import com.hproject.common.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.TimeZone;

@Entity
@Getter
@NoArgsConstructor
public class Report extends BaseTimeEntity {
    @Id
    private long id;

    private String target;

    private long target_id;

    private String report_category;

    private String report_content;

    private String completed_content;

    private TimeZone completed_at;
}
