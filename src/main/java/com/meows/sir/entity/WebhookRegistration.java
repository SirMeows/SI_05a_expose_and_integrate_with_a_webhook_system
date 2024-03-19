package com.meows.sir.entity;

import com.meows.sir.repository.WebhookRepository;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class WebhookRegistration {
    private String webhookUrl;
    private WebhookRepository webhookRepository;
}
