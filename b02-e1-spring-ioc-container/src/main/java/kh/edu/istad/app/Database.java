package kh.edu.istad.app;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Database {
    public List<String> getData() {
        return List.of(
                "Apple",
                "Banana",
                "Car",
                "Door"
        );
    }
}
