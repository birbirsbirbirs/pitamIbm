package co.pitam.pitamibm.controller;

import co.pitam.pitamibm.Application;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SendJms {
    private final JmsTemplate jmsTemplate;

    @GetMapping
    public void send(){
        String msg=UUID.randomUUID().toString();
        log.info("sending: {}",msg);
        jmsTemplate.convertAndSend(Application.qName,msg);
    }
}
