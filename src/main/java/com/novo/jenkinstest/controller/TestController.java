package com.novo.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author novo
 * @since 2021/4/22
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test() {
        return "Successfully build our first version! Let's try make our second version!";
    }
}
