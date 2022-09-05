package com.devLearn.com.Learning.error;

import com.devLearn.com.Learning.Entity.Department;
import com.devLearn.com.Learning.Entity.ErrorMessage;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> DepartmentNotFoundException(DepartmentNotFoundException exception, WebRequest request){

        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);


    }

    @ExceptionHandler(NoRecordsFoundException.class)
    public ResponseEntity<ErrorMessage> NoRecordsFoundExceptio(NoRecordsFoundException exception, WebRequest request){

        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);

    }



}
