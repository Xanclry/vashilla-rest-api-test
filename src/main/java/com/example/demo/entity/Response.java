package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Response {
    private String url;
    private String text;

    public Response(String url, String text) {
        this.url = url;
        this.text = text;
    }
}
