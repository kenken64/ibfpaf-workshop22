package sg.edu.nus.iss.workshop22.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler({RSVPNotFoundException.class})
    public ResponseEntity<ErrorMessage> handleInvalidException(Exception ex, HttpServletRequest request) {
        ErrorMessage errMsg = new ErrorMessage(HttpStatus.NOT_FOUND.value(),
                 new Date(),
                 ex.getMessage(), request.getRequestURL().toString());

         log.error(ex.getMessage());

         return new ResponseEntity<ErrorMessage>(errMsg, HttpStatus.NOT_FOUND);
    }
}
