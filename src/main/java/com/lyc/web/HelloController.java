package com.lyc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyc on 2017/3/20.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "hello";
    }
}