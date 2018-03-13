package pl.kamiluchnast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class Example {

    @RequestMapping("/")
    Mono<String> home() {
        return WebClient.create().get()
                .uri("http://httpstat.us/200")
                .retrieve()
                .bodyToMono(String.class);
    }

}