package org.sachin.controller;

import org.sachin.model.EmailData;
import org.sachin.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email/user")
public class EmailController {

    @Autowired
    EmailService emailservice;
    @PostMapping ("/sendEmail")
    public String SendEmail2( @RequestBody EmailData emaildata)
    {
        emailservice.sendEmailWithCc(emaildata.getSubject(), emaildata.getBody());
        return "Email-Verification Successfully";
    }

    @GetMapping
    public String resp()
    {
        return "resource found";
    }

}
