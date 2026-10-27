package kh.edu.istad.app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor // help create constructor with final field
public class ProductController {

    private final Product product;

    @GetMapping("/api/products")
    public Map<String, Object> getData() {
        return Map.of("data", product);
    }

}
