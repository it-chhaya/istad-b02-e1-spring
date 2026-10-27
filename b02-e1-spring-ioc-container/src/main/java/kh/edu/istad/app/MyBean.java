package kh.edu.istad.app;

import org.springframework.stereotype.Component;

// Annotation-base configuration
@Component // Create bean of myBean and store in IoC container
public class MyBean {
    public void printName() {
        IO.println("MyBean");
    }
}
