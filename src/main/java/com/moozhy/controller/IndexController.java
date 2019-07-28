package com.moozhy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 陆逊
 *
 * @desc: 首页
 */
@RestController
public class IndexController {

    @GetMapping
    public String hello() {
        return "The project sponsored by 牧之科技!";
    }

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("common/loginView");
    }
}
