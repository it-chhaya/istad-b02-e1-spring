package kh.edu.istad.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class B02E1SpringIocContainerApplication implements CommandLineRunner {
    // 1. Declare dependency
    // - Dependency has 2 types: required and optional
    private final MyBean myBean;

    public B02E1SpringIocContainerApplication(MyBean myBean) { // 2. Inject myBean dependency
        this.myBean = myBean;
    }

    @Override
    public void run(String... args) throws Exception {
        myBean.printName();
    }

    public static void main(String[] args) {
        SpringApplication.run(B02E1SpringIocContainerApplication.class, args);
    }

}
