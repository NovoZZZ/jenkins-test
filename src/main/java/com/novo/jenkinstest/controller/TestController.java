package com.novo.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author novo
 * @since 2021/4/22
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test() {
        Set<Integer> set = new HashSet<>();
        return "2021年04月26日10:30:02 第三次尝试webhook33333333";
    }
}
