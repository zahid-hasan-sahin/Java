
package com.mycompany.sprinvmvc.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandle {
    
    @ExceptionHandler({Exception.class})
    public String exceptionHandle() {
        return "error";
    }

}
