package com.example;

import io.micronaut.context.annotation.Import;
import io.micronaut.runtime.Micronaut;

@Import(packages = {
        "com.example.service.a",
        "com.example.service.b"
})
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
