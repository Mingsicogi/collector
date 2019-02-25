package com.example.collector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class CollectorApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CollectorApplication.class).web(WebApplicationType.NONE).run(args);

	}

}
