package com.mengyunzhi.organization.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class LoginControllerTest extends controllerTest{
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void test1() throws Exception {
        String url = "http://localhost:8080/login/test";
        this.mockMvc.perform(get(url).param("username", "jdxiang")).andDo(print()).andExpect(status().isOk());
    }
}