package com.example.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserInfo {

    public static Map<String,User> userMap = new HashMap<>();

    static {
        userMap.put("1",new User("1","name","","",new ArrayList<>()));
    }

}
