package co.pitam.pitamibm.stream;

import co.pitam.pitamibm.Application;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Slf4j
@RequiredArgsConstructor
@Component
public class Listener {
    @JmsListener(destination = Application.qName)
    public void receiveMessage(String msg){
        log.info("received: {}",msg);
    }
}
