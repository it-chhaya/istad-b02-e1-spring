package kh.edu.istad.app;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RequiredArgsConstructor // help create constructor with final field
public class ProductController {

    private final Product product;
    private final Product product2;

    public ProductController(
            Product product,
            @Qualifier("createProductBean2") Product product2
                             ) {
        this.product = product;
        this.product2 = product2;
    }

    @GetMapping("/api/products")
    public Map<String, Object> getData() {
        return Map.of("data", product, "data2", product2);
    }

}
