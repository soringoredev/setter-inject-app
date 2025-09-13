package com.example.setter_injection_app.rest;

import com.example.setter_injection_app.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef;

    //constructor
    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }

//    // setter
//    @Autowired
//    public void setMyChef(Chef theChef) {
//        myChef = theChef;
//    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}