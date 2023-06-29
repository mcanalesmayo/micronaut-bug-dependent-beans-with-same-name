package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class DemoControllerIntegTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void should_return_the_request_body() {
        HttpResponse<?> res = client.toBlocking().exchange(HttpRequest.GET("/test"));

        assertEquals(HttpStatus.OK, res.getStatus());
    }
}
