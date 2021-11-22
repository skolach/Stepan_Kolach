package com.epam.spring.hw_3.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE {
    
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
        return "BeanE [name=" + name + ", value=" + value + "]";
    }

}