package com.lc.ibps.config;

import javax.servlet.Filter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.lc.ibps.cloud.oauth.client.filter.AccessTokenFilter;

@Configuration
@ImportResource(locations={"classpath:conf/ibps-context.xml"})
public class InitialConfigure {
	
	@Bean
    @ConditionalOnMissingBean
    public FilterRegistrationBean<Filter> accessTokenFilterRegistrationBean() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>();
        filterRegistrationBean.setFilter(new AccessTokenFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("http_context_url", "http://192.168.3.220:5100/ibps/oauth2/v3/user/context/default");
        filterRegistrationBean.addInitParameter("http_access_token_verify_url", "http://192.168.3.220:5100/ibps/oauth2/v3/authentication/verify");
        return filterRegistrationBean;
    }
	
}
