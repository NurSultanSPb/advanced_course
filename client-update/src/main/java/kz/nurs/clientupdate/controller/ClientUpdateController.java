package kz.nurs.clientupdate.controller;

import kz.nurs.clientupdate.feign.ClientServiceFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/update")
@RequiredArgsConstructor
public class ClientUpdateController {

    private final ClientServiceFeign clientServiceFeign;

    @GetMapping
    public String testLoadBalancer() {
        return clientServiceFeign.testLoadBalancer();
    }
}
