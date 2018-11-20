package cc.liuy.until.Common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by  liuyang
 * 2018/9/25    17:03
 * cc.liuy.until.Common
 * All Right Reserved by liuyang.
 **/
@PropertySource("application.properties")
public class Constant {

    @Value("${path}")
    public String path;
    @Value("${wxpath}")
    public String wxpath;
    @Value("${testModel}")
    public boolean testModel;
}
