package com.Ed.notification_strategy.service.strategy;

import com.Ed.notification_strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(TwitterNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Twitter [{}]", message, destination);
    }
}
