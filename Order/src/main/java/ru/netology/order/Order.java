package ru.netology.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int userId;
    private int amount;
    private int currency;
    private List<String> products;
}
