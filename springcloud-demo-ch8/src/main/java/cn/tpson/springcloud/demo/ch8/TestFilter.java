package cn.tpson.springcloud.demo.ch8;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Zhangka in 2018/07/13
 */
@Component
public class TestFilter extends ZuulFilter {
    private static final Logger log = LoggerFactory.getLogger(TestFilter.class);
    @Override
    public String filterType() {
        log.info("filterType");
        return "pre";
    }

    @Override
    public int filterOrder() {
        log.info("filterOrder");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        log.info("shouldFilter");
        return true;
    }

    @Override
    public Object run() {
        log.info("run");
        throw new RuntimeException("请登录");
//        return null;
    }
}
