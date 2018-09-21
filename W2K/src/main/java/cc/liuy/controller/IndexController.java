package cc.liuy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {


    @RequestMapping("/")
    public String helloworld() {

        return "helloworld";
    }
}
