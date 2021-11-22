package com.epam.spring.hw_3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanD {

    @Value("${BeanD.name}")
    private String name;
    @Value("${BeanD.value}")
    private String value;

    public void init(){
        System.out.println("In Init method of beabD");
    }

    public void destroy(){
        System.out.println("In destroy method of beanD");
    }

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
        return "BeanD [name=" + name + ", value=" + value + "]";
    }

}