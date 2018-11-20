package cc.liuy.Service.gjyy;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Service
public class MlymVote {
 //   @Value("#{path}")
    static String path="http://www.gjyunying.com/active/mlym";

    public void voteConsumer(Long userid) {
        BiConsumer<Integer, Long> consumer = MlymVote::vote;
        try {
            for (int i = 1; i < 112; i++) {
                consumer.accept(i, userid);
                //Thread.sleep(20000);
                System.out.println("id"+userid+"："+i+"次");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String vote(int ip, Long user) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result = "";
        try {
            // 创建httpget.
            HttpPost httppost = new HttpPost(path);
            System.out.println("executing request " + httppost.getURI());//545+654\4457
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add(new BasicNameValuePair("userId", String.valueOf(user)));
            formparams.add(new BasicNameValuePair("activeId", "4"));
            UrlEncodedFormEntity uefEntity;
            CloseableHttpResponse response = null;
            try {
<<<<<<< HEAD
                httppost.setHeader("x-forwarded-for", "114.114.115." + ip);
                  uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
=======
                httppost.setHeader("x-forwarded-for", "114.114.116." + ip);
                uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
>>>>>>> eb2a2b2b7674390d052961e13ff91d4194fdebed
                httppost.setEntity(uefEntity);
                response = httpclient.execute(httppost);
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    System.out.println("Response content: " + EntityUtils.toString(entity));
                }
                System.out.println("------------------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        }
    }
}
