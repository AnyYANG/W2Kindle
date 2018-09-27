package cc.liuy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Value("${hello}")
    String str1;
    @Value("${world}")
    String str2;

    @RequestMapping("/")
    public String helloworld() {

        return str1+str2;
    }

    @RequestMapping("/wx")
    public String helloworld2() {

        return str1+str2;
    }

    @RequestMapping("/findsiteHtml")
    public String helloworld(String path) {
        String result = "";

        return "helloworld";
    }
}
