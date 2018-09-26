package cc.liuy.bean.request;

import cc.liuy.bean.request.BaseMsg;

/**
 * Created by  liuyang
 * ${Date}
 * ${Email}
 * All Right Reserved.
 **/

public class TxtMsg extends BaseMsg {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

}