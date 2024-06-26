package com.task.restController;

import com.task.dto.AlertDTO;
import com.task.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserRestController {

    @PostMapping(value = "login")
    public ResponseEntity<AlertDTO> login(@RequestBody User user) {
        AlertDTO alertDTO = new AlertDTO();
        user.getUsername();
        return new ResponseEntity<>(alertDTO, HttpStatus.OK);
    }
}
