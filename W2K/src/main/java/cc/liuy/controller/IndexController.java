package cc.liuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @RequestMapping("/")
    public String helloworld() {

        return "helloworld";
    }

    @RequestMapping("/findsiteHtml")
    public String helloworld(String path) {
        String result = "";

        return "helloworld";
    }
}
