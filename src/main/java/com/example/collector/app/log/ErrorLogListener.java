package com.example.collector.app.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorLogListener {

    @KafkaListener(topics = "mytopic", groupId = "mytest-group")
    public void listen(String message){
        log.error("[ Occur the error ] " + message);
    }
}
