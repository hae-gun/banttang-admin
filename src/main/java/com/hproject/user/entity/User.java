package com.hproject.user.entity;

import com.hproject.common.BaseTimeEntity;
import com.hproject.deal.entity.Deal;
import com.hproject.faq.entity.Faq;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User extends BaseTimeEntity {
    @Id
    private long id;
    private String nickname;
    private String provider;
    private String user_key;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Deal> dealList = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Faq> faqList = new ArrayList<>();
}
