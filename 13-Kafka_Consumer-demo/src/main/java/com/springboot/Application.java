package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.springboot.constants.AppConstants;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	@KafkaListener(topics = AppConstants.TOPIC,groupId = "group_order_topic")
	public void subscribeMsg(String order) {
		System.out.print("*** Msg Recieved From Kafka *** :: ");
		System.out.println(order);
		//logic
	}

}
