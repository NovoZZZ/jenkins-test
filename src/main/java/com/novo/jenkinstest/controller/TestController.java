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
        return "2021年04月23日17:02:13 成功部署，尝试webHook";
    }
}
