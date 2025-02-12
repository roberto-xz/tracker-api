
package com.rdtech.tracker_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/msg")
    public String hello() {
        return "Olá, mundo,dois";
    }
}
