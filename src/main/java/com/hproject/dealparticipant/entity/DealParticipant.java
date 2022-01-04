package com.hproject.dealparticipant.entity;

import com.hproject.common.BaseTimeEntity;
import com.hproject.deal.entity.Deal;
import com.hproject.user.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

//@Entity
@Getter
@NoArgsConstructor
public class DealParticipant extends BaseTimeEntity {
    @Id
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Deal deal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

}

