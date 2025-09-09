package com.Ed.notification_strategy.service;

public interface NotificationStrategy {
    void sendNotification(String destination, String message);
}
