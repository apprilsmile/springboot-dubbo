package com.appril.provider;

import com.appril.api.IdubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DubboServiceImpl implements IdubboService {
    @Override
    public void dubboTest(String param) {
        System.out.println("this is dubbo-provider。"+ param);
    }
}
