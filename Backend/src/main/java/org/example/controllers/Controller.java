package org.example.controllers;
import org.example.Crime;
import org.example.CrimeType;
import org.example.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/crime")
    public Crime greeting(@RequestParam(required=false, defaultValue="World") String name){
        System.out.println("=== in greeting ===");
        return new Crime(CrimeType.THEFT_OVER, new Date(), new Location(1,2));
    }
}
