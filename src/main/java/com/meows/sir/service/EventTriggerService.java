package com.meows.sir.service;

import com.meows.sir.entity.EventType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EventTriggerService {
    public void triggerEvents() {
        
        var eventType = EventType.LIST_CREATED;
        var webhookUrl = "exampleUrl";
        printEventNotificationToConsole(eventType, webhookUrl);

    }

    private static void printEventNotificationToConsole(EventType eventType, String webhookUrl) {
        System.out.println("Notification of event type " + eventType + " sent to " + webhookUrl);
    }

    //Logic to determine when to send different event notifications
    //(in this case triggered a few times automatically,
    //but irl triggered by the actual event occurring in the system)
    //Retrieve relevant webhook URLs from WebhookService
    //Make POST requests to client webhooks
}
