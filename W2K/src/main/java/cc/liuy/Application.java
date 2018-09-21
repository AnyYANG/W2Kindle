package cc.liuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot 应用启动类
 *
 * Created by  lynx  2018年9月21日
 */
// Spring Boot 应用的标识
//重点


@SpringBootApplication
public class Application {

    public static void main(String args[]){
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);

    }
}
