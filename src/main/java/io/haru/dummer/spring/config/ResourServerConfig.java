package io.haru.dummer.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-02
 */
@Configuration
@EnableResourceServer
public class ResourServerConfig extends ResourceServerConfigurerAdapter {
    @Value("${io.haru.dummer.security.resourceId}")
    private String resourceId;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .requestMatchers()
            .antMatchers("/me")
            .and()
            .authorizeRequests()
            .anyRequest()
            .authenticated();
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(resourceId);
    }
}
