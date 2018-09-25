package cc.liuy.Service;



import jdk.internal.util.xml.impl.Input;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.FileWriter;
import java.io.InputStream;

public class HtmlUtil {
    public static void main(String[] args) {
        String path="https://blog.csdn.net/jackiehff/article/details/17765909";
      try(CloseableHttpClient httpclient = HttpClients.createDefault()){
          HttpGet  httpGet = new HttpGet(path);
          httpGet.setHeader("Accept", "text/html,application/xhtml+xml," +
                  "application/xml;q=0.9,image/webp,*/*;q=0.8");
          httpGet.setHeader("Accept-Encoding", "gzip, deflate, sdch, br");
          httpGet.setHeader("Accept-Language", "zh-CN,zh;q=0.8");
          httpGet.setHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36" +
                  " (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
          CloseableHttpResponse response =  httpclient.execute(httpGet);
          HttpEntity entity =  response.getEntity();
          String result = EntityUtils.toString(entity);
          System.out.println(result);
      }catch (Exception e){
          e.printStackTrace();
      }
    }

}
