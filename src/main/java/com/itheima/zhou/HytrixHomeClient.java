package com.itheima.zhou;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Admin
 */
@FeignClient(value = "service-hi", fallbackFactory = HystrixClientFallbackFactory.class)
public interface HytrixHomeClient {
    @GetMapping("/hi")
    String consumer(@RequestParam("name") String name);
}
