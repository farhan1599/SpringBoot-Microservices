package com.springboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfig {

//==============@Value:reading the data from properties file==========================

	@Value("${spring.data.redis.url}")
	private String url;

	@Value("${spring.data.redis.port}")
	private Integer port;

	@Value("${spring.data.redis.username}")
	private String username;

	@Value("${spring.data.redis.password}")
	private String passsword;

//===================================================================================

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		// Redis server configuration
		RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration(url, port);
		serverConfig.setUsername(username);
		serverConfig.setPassword(passsword);

		// Redis client configuration
		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}
}
