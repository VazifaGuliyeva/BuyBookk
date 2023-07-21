package com.example.buybook.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@ControllerAdvice //bu classimizi bir nov controller-e advice edir ki,yeni bu classi istifade et
@Slf4j //loggerleri getirmek ucun istifade olunur.Meselen bu annotasiyani yazib asagi dussek goreceyik ki,log.yazdiqda qarsmiza error,info ve warn kimi melumatlar cixir
public class CustomException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthorNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public  ResponseEntity<Object> handleUserNotFound(AuthorNotFoundException ex)  {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
                ex.getMessage(),
                null);
        log.error("Author not found");

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(CategoryNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public  ResponseEntity<Object> handleUserNotFound(CategoryNotFoundException ex)  {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
                ex.getMessage(),
                null);
        log.error("Category not found");

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public  ResponseEntity<Object> handleUserNotFound(ProductNotFoundException ex)  {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
                ex.getMessage(),
                null);
        log.error("Product not found");

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(PublishingHouseNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public  ResponseEntity<Object> handleUserNotFound(PublishingHouseNotFoundException ex)  {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
                ex.getMessage(),
                null);
        log.error("PublishingHouese not found");

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
        ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
    }

}
