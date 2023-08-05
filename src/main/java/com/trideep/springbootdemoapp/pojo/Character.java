package com.trideep.springbootdemoapp.pojo;

import lombok.Getter;
import lombok.Setter;

public class Character {
    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String slug;

    @Getter
    @Setter
    House house;
}
