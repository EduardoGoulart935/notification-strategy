package com.Ed.notification_strategy.service;

import com.Ed.notification_strategy.service.strategy.DiscordNotificationStartegy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
        "discord", new DiscordNotificationStartegy()
    );

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(channel).sendNotification(destination, message);
    }
}
