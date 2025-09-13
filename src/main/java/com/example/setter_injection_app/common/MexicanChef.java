package com.example.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina, cilantro y salsa picante!";
    }
}
