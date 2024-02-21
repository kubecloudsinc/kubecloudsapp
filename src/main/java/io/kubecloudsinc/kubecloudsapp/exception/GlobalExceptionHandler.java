package io.kubecloudsinc.kubecloudsapp.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
@Controller
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex) {
        Map<String, Object> body = new HashMap<>();
        log.error(ex.getMessage());
        body.put("message", "An error occurred");

        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
/*    @ExceptionHandler(Exception.class)
    public ModelAndView handleGlobalException(Exception ex, Model model) {
        log.error("An error occurred: {}", ex.getMessage(), ex);

        model.addAttribute("errorMessage", "An error occurred: " + ex.getMessage());
        model.addAttribute("exception", ex);

        return new ModelAndView("error");
    }*/
}