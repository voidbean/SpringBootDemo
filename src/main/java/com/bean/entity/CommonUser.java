package com.bean.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 公共user实体
 *
 * @author voidbean
 * @create 2021/2/25
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@TableName(value = "user")
public class CommonUser {

    @TableId
    private String uid;
    private String username;
    private String password;

}
