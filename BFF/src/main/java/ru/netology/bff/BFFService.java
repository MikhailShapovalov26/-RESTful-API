package ru.netology.bff;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BFFService {



    public List<OrderDTO> getOrders(int userId, RestTemplate restTemplate) {
        return restTemplate.getForObject("http://localhost:8082/api/orders/by-user/{user}", List.class, userId);
    }
    public UserDTO getUser(int userId, RestTemplate restTemplate) {
        return restTemplate.getForObject("http://localhost:8081/api/users/{userId}", UserDTO.class, userId);
    }
    public MapperDTO resultBFF(int userId, RestTemplate restTemplate) {
       return new MapperDTO(getUser(userId, restTemplate), getOrders(userId, restTemplate));

    }


}
