package cc.liuy.bean.response;

import com.fasterxml.jackson.databind.ser.Serializers;

import java.util.List;

/**
 * Created by  liuyang
 * 2018/9/25    16:43
 * cc.liuy.bean.response
 * All Right Reserved by liuyang.
 **/

public class NewMsg extends Serializers.Base {
    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }

}
