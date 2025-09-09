package com.Ed.notification_strategy.service;

import com.Ed.notification_strategy.service.strategy.*;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "twitter", new TwitterNotificationStrategy(),
            "email", new EmailNotificationStrategy(),
            "whatsapp", new WhatsappNotificationStrategy()
    );

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(channel).sendNotification(destination, message);
    }
}
