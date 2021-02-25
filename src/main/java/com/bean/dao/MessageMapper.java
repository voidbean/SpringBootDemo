package com.bean.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bean.entity.CommonMessage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author voidbean
 * @create 2021/2/25
 * @since 1.0.0
 */
@Mapper
public interface MessageMapper extends BaseMapper<CommonMessage> {
}
