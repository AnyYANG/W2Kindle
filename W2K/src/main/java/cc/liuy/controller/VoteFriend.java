package cc.liuy.controller;


import cc.liuy.Service.gjyy.MlymVote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class VoteFriend {
    @Resource
    MlymVote mlymVote;
    @ResponseBody
    @RequestMapping("/votezjl")
    public String votezjl() {

        return "helloworld";
    }
    @ResponseBody
    @RequestMapping("/votewts")
    public String votewts() {

        return "helloworld";
    }
}
