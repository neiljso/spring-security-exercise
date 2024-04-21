package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balances")
public class BalanceController {

    @GetMapping("/my-balance")
    public String getMyBalance() {
        return "Here is my balance";
    }
}
