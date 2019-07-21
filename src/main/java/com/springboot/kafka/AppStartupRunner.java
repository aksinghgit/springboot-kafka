package com.springboot.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {
    
    @Autowired
    KafkaSender kafkaSender;

	
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	 kafkaSender.send("topic1", "test Message from applicaton runner");
    	 kafkaSender.send("topic1", "test Message from applicaton runner1");
    	 kafkaSender.send("topic1", "test Message from applicaton runner2");
    	 kafkaSender.send("topic1", "test Message from applicaton runner3");
    }
}