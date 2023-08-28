package com.example.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "member name is necessary")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
