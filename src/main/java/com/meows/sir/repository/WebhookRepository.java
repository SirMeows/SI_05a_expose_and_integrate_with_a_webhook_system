package com.meows.sir.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
@Setter
@Service
public class WebhookRepository {

    private final String fileLocation = "webhookUrls";
}
