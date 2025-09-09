package com.Ed.notification_strategy.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class NotificationRequest {


    public record notificationRequest(
       @NotBlank
       String channel,
       @NotBlank
       String destination,
       @NotBlank
       String message
    ){}

}
