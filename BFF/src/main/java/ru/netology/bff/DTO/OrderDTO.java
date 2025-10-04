package ru.netology.bff.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OrderDTO {
    private int userId;
    private int amount;
    private int currency;
    private List<String> products;
}
