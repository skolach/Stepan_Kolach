package com.epam.spring.hw_3;

import com.epam.spring.hw_3.beans.BeanB;
import com.epam.spring.hw_3.config.BeansConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        System.out.println(context.getBean(BeanB.class).toString());

        ((ConfigurableApplicationContext)context).close();
    }
}
