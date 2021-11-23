package com.epam.spring.hw_3.config;

import com.epam.spring.hw_3.beans.BeanB;
import com.epam.spring.hw_3.beans.BeanC;
import com.epam.spring.hw_3.beans.BeanD;
import com.epam.spring.hw_3.beans.BeanFactoryPostProcessorBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.spring.hw_3.beans")
@PropertySource("classpath:BeanValues.properties")
@Import(OtherConfig.class)
public class BeansConfig {

    @Bean(name = "beanB", initMethod = "init", destroyMethod = "destroy")
    public BeanB getBeanB(){
        return new BeanB();
    }

    @Bean(name = "beanC", initMethod = "init", destroyMethod = "destroy")
    public BeanC getBeanC(){
        return new BeanC();
    }

    @Bean(name = "beanD", initMethod = "init", destroyMethod = "destroy")
    public BeanD getBeanD(){
        return new BeanD();
    }

    @Bean
    public BeanFactoryPostProcessorBean getBeanFactoryPostProcessorBean(){
        return new BeanFactoryPostProcessorBean();
    }
}
