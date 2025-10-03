package ru.netology.bff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BFFController {
    private final RestTemplate restTemplate;

    BFFService bffService = new BFFService();

    public BFFController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/api/site-bff/user/{userId}")
    public MapperDTO user(@PathVariable int userId) {

        return bffService.resultBFF(userId, restTemplate);
    }
}
