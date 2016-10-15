package io.haru.dummer.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-02
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password("test")
            .roles("CLIENT_ADMIN");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/admin/**").hasAnyRole("CLIENT_ADMIN")
            .antMatchers("/users/**").hasAnyRole("CLIENT_ADMIN", "USER")
            //.anyRequest().authenticated()
                .and()
                .formLogin()
            .usernameParameter("username")
            .passwordParameter("password")
            .defaultSuccessUrl("/users")
                .failureUrl("/login?error=loginFailed")
                .permitAll()
                .and()
                .logout()
                .permitAll()
        ;
    }

    @Override
    public AuthenticationManager authenticationManagerBean()
        throws Exception {
        return super.authenticationManagerBean();
    }
}
