package com.greetingapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServices {
    public String hello()
    {
        return "Hello from services";
    }
}
