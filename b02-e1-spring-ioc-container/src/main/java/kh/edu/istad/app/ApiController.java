package kh.edu.istad.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    private Database db;

    @Autowired
    public void setDb(Database db) {
        this.db = db;
    }

    @GetMapping("/api/data")
    public Map<String, Object> getData() {
        return Map.of("data", db.getData());
    }

}
