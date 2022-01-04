package com.hproject.notice.entity;

import com.hproject.common.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Notice extends BaseTimeEntity {
    @Id
    private long id;
    private String title;
    private String content;
}
