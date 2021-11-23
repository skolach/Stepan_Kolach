package com.epam.spring.hw_3.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean{
    
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA [name=" + name + ", value=" + value + "]";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy() method of DisposableBean interface of beanA");
        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet() method of InitializingBean interface of beanA");
        
    }

}