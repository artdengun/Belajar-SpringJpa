package com.paytech.bpr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HaloController {

    @GetMapping(value = "/index") // buat link
    public String haloController(){
        return "/welcome";
    }
}
