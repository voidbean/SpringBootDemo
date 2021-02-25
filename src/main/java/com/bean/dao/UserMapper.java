package com.bean.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bean.entity.CommonUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author voidbean
 * @create 2021/2/25
 * @since 1.0.0
 */
@Mapper
public interface UserMapper extends BaseMapper<CommonUser> {
}
