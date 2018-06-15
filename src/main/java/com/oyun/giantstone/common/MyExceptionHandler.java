package com.oyun.giantstone.common;

import com.oyun.giantstone.exception.ParamException;
import com.oyun.giantstone.exception.PermissionException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(BindException.class)
    public JsonData handleBindException(BindException ex) {
        // ex.getFieldError():随机返回一个对象属性的异常信息。如果要一次性返回所有对象属性异常信息，则调用ex.getAllErrors()
        List<FieldError> fieldErrors = ex.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        for (FieldError fieldError :
                fieldErrors) {
            log.info(fieldError.getField().toString());
            sb.append(fieldError.getField()).append("=[").append(fieldError.getRejectedValue()).append("]")
                    .append(fieldError.getDefaultMessage());
        }
        // 生成返回结果
        JsonData errorResult = new JsonData(false);
        errorResult.setMsg(sb.toString());
        return errorResult;
        }

        @ExceptionHandler(PermissionException.class)
    public JsonData handlePermissionException(PermissionException e){

        JsonData result = new JsonData(false);
        result.setMsg(e.getMessage());

        return result;
    }

}