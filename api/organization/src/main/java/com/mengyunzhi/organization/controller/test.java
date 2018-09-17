package com.mengyunzhi.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/")
@RestController
public class test {
    @GetMapping("/get")
    public String get(HttpSession session) {
        session.setAttribute("test", new String("1111"));
        return (String) session.getAttribute("test");
    }
    @GetMapping("/test")
    public String test(HttpSession session) {
        return (String) session.getAttribute("test");
    }
}
