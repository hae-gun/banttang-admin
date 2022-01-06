package com.hproject.dealparticipant.entity;

import com.hproject.common.BaseTimeEntity;
import com.hproject.deal.entity.Deal;
import com.hproject.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class DealParticipant extends BaseTimeEntity {
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Deal deal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
}

