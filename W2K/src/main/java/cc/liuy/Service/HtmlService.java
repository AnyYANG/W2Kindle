package cc.liuy.Service;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;

public class HtmlService {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
     //   String url = "https://mp.weixin.qq.com/s/FzH28t6P59b6HunWI8fajQ";
        String url =  "https://mp.weixin.qq.com/s/WV3-13J-d5TDmirDDQ_VrQ";
        //创建HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //目标网址
       // String url = "http://www.oschina.net/";

        //创建请求方法
        HttpGet httpGet = new HttpGet(url);

        //设置Header模拟浏览器行为
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36");

        try {
            //发送请求，收取响应
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                //解析响应
                String entity = EntityUtils.toString(httpResponse.getEntity());
                System.out.println(entity);
                saveHtml("d:/200.html",entity);
            }

            EntityUtils.consume(httpResponse.getEntity());
            httpResponse.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Method: saveHtml
     * Description: save String to file
     *
     * @param filepath file path which need to be saved
     * @param str      string saved
     */
    public static void saveHtml(String filepath, String str) {

        try {
            /*@SuppressWarnings("resource")
            FileWriter fw = new FileWriter(filepath);
            fw.write(str);
            fw.flush();*/
            OutputStreamWriter outs = new OutputStreamWriter(new FileOutputStream(filepath, true), "utf-8");
            outs.write(str);
            outs.close();
        } catch (IOException e) {
            System.out.println("Error at save html...");
            e.printStackTrace();
        }
    }

    /**
     * Method: InputStream2String
     * Description: make InputStream to String
     *
     * @param in_st   inputstream which need to be converted
     * @param charset encoder of value
     * @throws IOException if an error occurred
     */
    public static String InputStream2String(InputStream in_st, String charset) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(in_st, charset));
        StringBuffer res = new StringBuffer();
        String line = "";
        while ((line = buff.readLine()) != null) {
            res.append(line);
        }
        return res.toString();
    }

}

