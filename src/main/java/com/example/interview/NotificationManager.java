package com.example.interview;

public class NotificationManager {

    /*
    Develop a notification system for a social media platform.

When events happen (such as a new message, friend request, or tag), users receive notifications via different channels (Email, SMS). Each channel has different rules for when it should trigger, and there are different notification types (info, warning, critical).
The system should be designed in a way that:
It’s easy to add new notification channels (e.g., in-app notifications) or notification types without modifying the core notification logic.
The notification logic should be customizable for individual users (e.g., some users may opt out of SMS notifications but still receive email notifications).

Instructions:
	•	Implement a Notification class to represent a notification
Implement a User class.
    •	Each user can have multiple preferences
	•	Create a NotificationManager that manages sending notifications through different channels.
	•	Write a function sendNotification(notification) that sends the notification via all the user’s preferred channels.
     */

//    public String processEvent(Event event){
//
//        //Log
//
//        sendNotification(event);
//        return "OK";
//
//
//
//    }

//    private void sendNotification(Event event) {
//
//        switch(event.getNotification().getNotificationType()){
//            case "EMAIL":
//                sendEmailNotification(event);
//            case"SMS":
//
//        }
//
//
//    }

//    private void sendEmailNotification(Event event) {
//
//
//        String userId = event.getUserId();
//
//        User user = UserInfo.userMap.get(user);
//
//
//
//
//        if(user.getOptedChannelList().contains("EMAIL")){
//
//            //send emails emailadress
//
//        }
//    }


}
