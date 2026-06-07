package com.example.tra.task.Controllers;

import com.example.tra.task.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @DeleteMapping("/{ids}")
    public String deleteRegistration(@PathVariable List<Integer> ids) {
        return registrationService.deleteMultipleByIds(ids);
    }

}
