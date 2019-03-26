package com.mybatisplus.demo.common.exception;

import lombok.Data;

@Data
public class CommonException extends Exception {

    private Integer code;
    private String msg;


}
