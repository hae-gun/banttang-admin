package com.hproject.deal.entity;

import com.hproject.common.BaseTimeEntity;
import com.hproject.dealparticipant.entity.DealParticipant;
import com.hproject.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Entity
@Getter
@NoArgsConstructor
public class Deal extends BaseTimeEntity {
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
    private String title;
    private String content;
    private String location;
    private String category;
    private String category_detail;
    private TimeZone completed_at;
    private int beongae_count;

    @OneToMany(mappedBy = "deal", cascade = CascadeType.ALL)
    private List<DealParticipant> dealParticipantList = new ArrayList<>();
}
