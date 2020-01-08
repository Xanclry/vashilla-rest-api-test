package com.example.demo.controller;

import com.example.demo.entity.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    private final String URL = "https://snob.ru/i/indoc/user_8431/09b23d427d9c4dd7781bfaa154eaf81b.jpg";
    private final String MESSAGE = "HELLO RESHILLA!";

    private Response response = new Response(URL, MESSAGE);

    @GetMapping
    public Response returnExample() {
        return response;
    }

}
