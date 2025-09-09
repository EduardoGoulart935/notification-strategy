package com.Ed.notification_strategy.service.strategy;

import com.Ed.notification_strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstagramNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(InstagramNotificationStrategy.class);

    @Override
    public void sendNotification(String destination,String message){
        logger.info("Notificação [{}] enviada para o Instagram [{}]", message, destination);
    }
}
