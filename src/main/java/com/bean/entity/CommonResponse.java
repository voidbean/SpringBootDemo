package com.bean.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * res
 *
 * @author beanalter
 * @create 2020/9/8
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@ToString
public class CommonResponse {

    private Integer code;
    private String message;
    private Object data;

}
