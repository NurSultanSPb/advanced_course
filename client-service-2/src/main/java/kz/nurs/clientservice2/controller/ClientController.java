package kz.nurs.clientservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @GetMapping("test")
    public String testLoadBalancer() {
        return "Hello from client-service-2";
    }
}
