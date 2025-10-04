package ru.netology.bff.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class MapperDTO {
    private UserDTO user;
    private List<OrderDTO> order;
}
