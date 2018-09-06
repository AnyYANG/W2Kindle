package cc.liuy.Service;



import java.io.FileWriter;

public class HtmlUtil {
   /* public static void main(String[] args) {
        WebClient wc = new WebClient(BrowserVersion.getDefault());
        wc.setJavaScriptEnabled(true); //启用JS解释器，默认为true
        wc.setJavaScriptTimeout(100000);//设置JS执行的超时时间
        wc.setCssEnabled(false); //禁用css支持
        wc.setThrowExceptionOnScriptError(false); //js运行错误时，是否抛出异常
        wc.setTimeout(10000); //设置连接超时时间 ，这里是10S。如果为0，则无限期等待
        //wc.setWebConnection(

        //		   new WebConnectionWrapper(wc) {
        //		    public WebResponse getResponse(WebRequest request) throws IOException {
        //		                 WebResponse response = super.getResponse(request);
        //		                 if (request.getUrl().toExternalForm().contains("test.js")) {
        //		                     String content = response.getContentAsString("GBK");
        //		                     WebResponseData data = new WebResponseData(content.getBytes("UTF-8"),
        //		                             response.getStatusCode(), response.getStatusMessage(), response.getResponseHeaders());
        //		                     response = new WebResponse(data, request, response.getLoadTime());
        //		                 }
        //		                 return response;
        //		             }
        //		   }

        //);

        try {
            //HtmlPage page = wc.getPage("http://192.168.0.1/Del_Bridge_Wan.html");
            HtmlPage page = wc.getPage("http://localhost:8088/testWeb");
            FileWriter fileWriter = new FileWriter("D:\\text.html");
            System.out.println("over...");
            String str = "";
            //获取页面的XML代码
            str = page.asXml();
            fileWriter.write(str);
            //关闭webclient
            //wc.close();
            wc.closeAllWindows();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/

}
