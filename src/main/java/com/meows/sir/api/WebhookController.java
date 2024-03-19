package com.meows.sir.api;

import com.meows.sir.service.EventTriggerService;
import com.meows.sir.entity.WebhookRegistration;
import jakarta.annotation.security.PermitAll;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Getter
@Setter
public class WebhookController {
    private EventTriggerService eventTriggerService;

    @PermitAll
    @PostMapping("/ping")
    public void pingServer() {
        eventTriggerService.triggerEvents();
    }

    @PermitAll
    @PostMapping("register")
    public void registerUrl(@RequestBody WebhookRegistration body) {
        //Register url for some user
    }
}
