package com.epam.spring.hw_3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    @Value("${BeanB.name}")
    private String name;
    @Value("${BeanB.value}")
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
        return "BeanB [name=" + name + ", value=" + value + "]";
    }

}