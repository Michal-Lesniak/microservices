package com.example.clients.notification;

public record NotificationRequest(
        Long toCustomerId,
        String toCustomerName,
        String message
) {
}
