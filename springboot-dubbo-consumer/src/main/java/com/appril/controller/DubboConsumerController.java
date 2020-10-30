package com.appril.controller;

import com.appril.api.IdubboService;
import com.appril.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dubbo")
public class DubboConsumerController {

    @Autowired
    private IConsumerService consumerService;

    @GetMapping("/consumerTest")
    public void consumerTest(@RequestParam("param")String param){
        consumerService.consumerTest(param);
    }
}
