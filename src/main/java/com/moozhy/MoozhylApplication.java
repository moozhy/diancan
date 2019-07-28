package com.moozhy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author 陆逊
 */
@SpringBootApplication
public class MoozhylApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MoozhylApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MoozhylApplication.class, args);
	}
}
