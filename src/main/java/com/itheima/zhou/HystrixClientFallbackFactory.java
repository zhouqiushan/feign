package com.itheima.zhou;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2017-12-07 20:37
 **/
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HytrixHomeClient> {
    @Override
    public HytrixHomeClient create(Throwable throwable) {
        return new HytrixHomeClient() {
            @Override
            public String consumer(String name) {
                return "feign + hystrix ,提供者服务挂了";
            }
        };
    }
}