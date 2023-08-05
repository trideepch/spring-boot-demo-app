package com.trideep.springbootdemoapp.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GOTQuote {
    @Getter
    @Setter
    String sentence;

    @Getter
    @Setter
    Character character;
}
