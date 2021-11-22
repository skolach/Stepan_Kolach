package com.epam.spring.hw_3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.spring.hw_3.beans")
@PropertySource("classpath:BeanValues.properties")
@Import(OtherConfig.class)
public class BeansConfig {
    
}
