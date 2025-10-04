package ru.netology.bff.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.netology.bff.DTO.MapperDTO;
import ru.netology.bff.DTO.OrderDTO;
import ru.netology.bff.DTO.UserDTO;

import java.util.List;

@Service
public class BFFService {

    private final RestTemplate restTemplate;

    public BFFService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<OrderDTO> getOrders(int userId) {
        return this.restTemplate.getForObject("http://localhost:8082/api/orders/by-user/{user}", List.class, userId);
    }
    public UserDTO getUser(int userId) {
        return restTemplate.getForObject("http://localhost:8081/api/users/{userId}", UserDTO.class, userId);
    }
    public MapperDTO resultBFF(int userId) {
       return new MapperDTO(getUser(userId), getOrders(userId));

    }


}
