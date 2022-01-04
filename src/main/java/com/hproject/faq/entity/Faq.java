package com.hproject.faq.entity;

import com.hproject.common.BaseTimeEntity;
import com.hproject.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.TimeZone;

@Entity
@Getter
@NoArgsConstructor
public class Faq extends BaseTimeEntity {
    @Id
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private User user;

    private String title;

    private String content;

    @Enumerated(EnumType.STRING)
    private AnswerStatus answerStatus;

    private String answer;

    private TimeZone answered_at;
}
