package com.example.interview;

import java.util.List;

public class User {
    public User(String userId, String userName, String emailAddress, String phoneNumber, List<String> optedChannelList) {
        this.userId = userId;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.optedChannelList = optedChannelList;
    }

    private String userId;
    private String userName;
    private String emailAddress;
    private String phoneNumber;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getOptedChannelList() {
        return optedChannelList;
    }

    public void setOptedChannelList(List<String> optedChannelList) {
        this.optedChannelList = optedChannelList;
    }

    private List<String> optedChannelList;

}
