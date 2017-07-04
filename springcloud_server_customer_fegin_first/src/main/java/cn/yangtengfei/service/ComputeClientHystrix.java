package cn.yangtengfei.service;

import org.springframework.stereotype.Component;

/**
 * Created by dm on 2017/6/30.
 */

@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
