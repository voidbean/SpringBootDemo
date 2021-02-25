package com.bean.controller;

import com.bean.entity.CommonMessage;
import com.bean.entity.CommonResponse;
import com.bean.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: voidbean
 * @Date: 2019/1/3 15:30
 */
@RestController()
@RequestMapping("/")
@Slf4j
public class HelloController {

    @Autowired
    HelloService helloService;

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public CommonResponse sendMessage(CommonMessage message){
        helloService.recordMessage(message);
        return new CommonResponse().setCode(0).setMessage("Success").setData(message);
    }

}