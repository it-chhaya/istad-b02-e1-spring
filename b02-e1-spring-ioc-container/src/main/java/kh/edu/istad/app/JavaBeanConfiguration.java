package kh.edu.istad.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.UUID;

//@Component
@Configuration
public class JavaBeanConfiguration {

    @Bean
    public Product createProductBean() {
        // TODO
        Product product = new Product(
                UUID.randomUUID().toString(),
                "Pro Vida",
                2500.00
        );

        return product;
    }

}
