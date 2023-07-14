package kz.nurs.clientupdate.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "client-service")
public interface ClientServiceFeign {
    @GetMapping("/api/client/test")
    String testLoadBalancer();
}
