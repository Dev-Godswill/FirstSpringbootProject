package com.daudugodswill.Springboot.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
//class to send back data/response
public class ErrorMessage {
    private HttpStatus status;
    private String message;
}
