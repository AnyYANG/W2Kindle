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
        mlymVote.voteConsumer(140815345463066624L);
        return "投票成功，两分钟后看结果";
    }

    @ResponseBody
    @RequestMapping("/votewts")
    public String votewts() {
        mlymVote.voteConsumer(149148251025571840L);
        return "投票成功，两分钟后看结果";
    }
}
