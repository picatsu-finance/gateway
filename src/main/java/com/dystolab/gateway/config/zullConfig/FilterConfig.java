package com.dystolab.gateway.config.zullConfig;

import com.dystolab.gateway.config.zullConfig.filters.ErrorFilter;
import com.dystolab.gateway.config.zullConfig.filters.PostFilter;
import com.dystolab.gateway.config.zullConfig.filters.PreFilter;
import com.dystolab.gateway.config.zullConfig.filters.RouteFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableZuulProxy
@Configuration
public class FilterConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}

