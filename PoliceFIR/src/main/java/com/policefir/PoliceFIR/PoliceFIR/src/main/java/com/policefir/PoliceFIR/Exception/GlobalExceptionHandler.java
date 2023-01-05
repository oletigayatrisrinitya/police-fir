package com.policefir.PoliceFIR.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
@ExceptionHandler(AppUserException.class)
public ResponseEntity<String> handleAppUserException(AppUserException ex){
return new ResponseEntity<String> (ex.getMessage(),HttpStatus.CONFLICT);

}

}
