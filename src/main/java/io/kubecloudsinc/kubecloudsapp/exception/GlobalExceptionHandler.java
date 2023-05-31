package io.kubecloudsinc.kubecloudsapp.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
@Slf4j
@Controller
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ModelAndView handleGlobalException(Exception ex, Model model) {
        log.error("An error occurred: {}", ex.getMessage(), ex);

        model.addAttribute("errorMessage", "An error occurred: " + ex.getMessage());
        model.addAttribute("exception", ex);

        return new ModelAndView("error");
    }
}