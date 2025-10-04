package ru.netology.bff.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String lastName;
    private String phone;
    private String address;

}
