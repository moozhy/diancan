package com.moozhy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陆逊
 *
 * @desc: 首页
 */
@RestController
public class BasicController {

    @GetMapping("/")
    public String hello() {
        return "The project sponsored by 牧之科技!";
    }

}
