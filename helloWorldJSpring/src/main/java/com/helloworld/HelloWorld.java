package com.helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 1/7/17.
 */

@Component
public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
