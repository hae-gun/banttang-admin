package com.hproject.test;

import com.hproject.user.User;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private User Test1 = new User(1,"test1","","12345");

    public Object getTest() {
        return Test1;
    }

    public Object getTest2() {
        return Test1.getNickname();
    }
}
