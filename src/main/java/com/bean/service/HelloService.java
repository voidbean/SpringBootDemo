package com.bean.service;

import com.bean.dao.MessageMapper;
import com.bean.dao.UserMapper;
import com.bean.entity.CommonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Service
 *
 * @author voidbean
 * @create 2019/10/10
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    MessageMapper messageMapper;

    public Boolean recordMessage(CommonMessage message){
        if (message.getCreatorUID() == null){
            message.setCreatorUID(UUID.randomUUID().toString());
        }
        return messageMapper.insert(message) > 0;
    }

}
