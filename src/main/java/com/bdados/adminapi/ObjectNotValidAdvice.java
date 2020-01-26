package com.bdados.adminapi;

import io.vavr.collection.List;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ObjectNotValidAdvice {

    @ResponseBody
    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    java.util.List<String> objectNotValidHandler(MethodArgumentNotValidException ex) {
        return List.ofAll(ex.getBindingResult().getFieldErrors())
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toJavaList();
    }
}
