package com.appril.service.impl;

import com.appril.api.IdubboService;
import com.appril.service.IConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Reference
//    @Reference(version = "1.0.0", check = false, registry = "logistics")
    private IdubboService idubboService;

    @Override
    public void consumerTest( String param) {
        idubboService.dubboTest(param);
    }
}
