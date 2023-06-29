package com.example.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller
public class DemoController {

    private final com.example.service.a.MyService a;
    private final com.example.service.b.MyService b;

    @Inject
    public DemoController(com.example.service.a.MyService a, com.example.service.b.MyService b) {
        this.a = a;
        this.b = b;
    }

    @Get("/test")
    public MutableHttpResponse<?> get(HttpRequest<?> request) {
        return HttpResponse.ok();
    }
}
