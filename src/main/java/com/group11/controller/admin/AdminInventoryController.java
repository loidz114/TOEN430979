package com.group11.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminInventoryController {
    @GetMapping("/inventory")
    public String inventory() {
        return "inventory";
    }
}
