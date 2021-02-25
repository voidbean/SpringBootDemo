package com.bean.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author voidbean
 * @create 2021/2/25
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@ToString
@TableName("message")
public class CommonMessage {

    @TableId
    String uid;
    String message;
    Long timestamp;
    @TableField("creator_uid")
    String creatorUID;

}
