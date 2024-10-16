package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        mapper.registerModule(new JavaTimeModule());

        WrapperTime wrapperTime = new WrapperTime(LocalDateTime.now());

        String dataTime = mapper.writeValueAsString(wrapperTime);

        System.out.println(dataTime);
    }
}