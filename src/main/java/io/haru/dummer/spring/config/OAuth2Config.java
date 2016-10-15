package io.haru.dummer.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-02
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
    @Value("${io.haru.dummer.security.resourceId}")
    private String resourceId;

    private String clientName = "haru-dummer-oauth";
    private String[] authorities = new String[] {"USER", "CLIENT_ADMIN"};
    private String[] scopes = new String[] {"read"};
    private String[] redirectUris = new String[] {"http://localhost:8080"};

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
            .withClient(clientName)
            .authorizedGrantTypes("password", "authorization_code", "refresh_token")
            .authorities(authorities)
            .scopes(scopes)
            .resourceIds(resourceId)
            .redirectUris(redirectUris)
            .accessTokenValiditySeconds(3600);
    }
}