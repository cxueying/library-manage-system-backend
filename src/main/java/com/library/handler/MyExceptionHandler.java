package com.library.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 */
@ControllerAdvice
@ResponseBody //返回json数据
@Log4j2
public class MyExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(Exception e) {
        String msg = e.getMessage();//获取到的错误信息
        log.error("IllegalArgumentException:" + msg);
        return "发生错误，错误信息为：" + msg;
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleRuntimeException(Exception e) {
        String msg = e.getMessage();
        return "发生运行时错误，错误信息为：" + msg;
    }
}
