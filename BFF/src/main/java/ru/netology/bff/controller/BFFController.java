package ru.netology.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.netology.bff.service.BFFService;
import ru.netology.bff.DTO.MapperDTO;

@RestController
public class BFFController {


    private final BFFService bffService;

    public BFFController(BFFService bffService) {
        this.bffService = bffService;
    }
    @GetMapping("/api/site-bff/user/{userId}")
    public MapperDTO user(@PathVariable int userId) {

        return bffService.resultBFF(userId);
    }
}
