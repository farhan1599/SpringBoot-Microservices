package com.springboot.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.springboot.constants.AppConstants;
import com.springboot.model.Order;

@Configuration
public class KafkaConsumerConfig {

	@Bean
	public ConsumerFactory<String, Order> consumerFactory() {

		Map<String, Object> configProps = new HashMap<>();

		configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
		configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(configProps, new StringDeserializer(), new JsonDeserializer<>());

	}

	/*It is used to listen to the topic, whenever msg comes it will listen immediately*/
	public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListenerFactory() {

		//consumer should consume from which server 
		ConcurrentKafkaListenerContainerFactory<String, Order> factory = new ConcurrentKafkaListenerContainerFactory<>();

		factory.setConsumerFactory(consumerFactory());

		return factory;
	}

}
