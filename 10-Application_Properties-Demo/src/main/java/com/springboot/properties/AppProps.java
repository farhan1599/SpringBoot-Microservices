package com.springboot.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "app") //add prefix in the properties file
public class AppProps {
	
	/*after prefix whatever word we are using same word we will give to our Map name
	 * In our case we're using "messages" after the prefix in properties file
	 * */
	private Map<String, String> messages = new HashMap<>();
}
