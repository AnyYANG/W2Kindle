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
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class MlymVote {

    public  String vote(int ip,Long user) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String result ="";
        try {
            // 创建httpget.
            HttpPost httppost = new HttpPost("http://www.gjyunying.com/active/mlym/vote");
            System.out.println("executing request " + httppost.getURI());//545+654\4457
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add(new BasicNameValuePair("userId", String.valueOf(user)));
            formparams.add(new BasicNameValuePair("activeId", "4"));
            UrlEncodedFormEntity uefEntity;
            CloseableHttpResponse response=null;
            try {
                httppost.setHeader("x-forwarded-for","114.114.113."+ip);
                uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
                httppost.setEntity(uefEntity);
                response = httpclient.execute(httppost);
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    System.out.println("Response content: " + EntityUtils.toString(entity));
                    result =  EntityUtils.toString(entity);
                }
                System.out.println("------------------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
