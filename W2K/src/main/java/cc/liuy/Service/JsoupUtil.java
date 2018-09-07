package cc.liuy.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
//http://www.open-open.com/jsoup/dom-navigation.htm
public class JsoupUtil {
    public  static void main(String[] args) {
       try {
           String  url ="https://mp.weixin.qq.com/s/WV3-13J-d5TDmirDDQ_VrQ";
           Document doc = Jsoup.connect(url).get();
           log(doc.title());
           Elements newsHeadlines = doc.getElementsByAttributeValue("","")
           for (Element headline : newsHeadlines) {
               log(headline.text());
           }
       }catch (IOException e){
           System.out.println("IOExcepiton");
       }

    }

    private static void log(String str) {
        System.out.println(str);
    }
}

