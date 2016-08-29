package io.haru.dummer.spring.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-14
 */
@Data
@ConfigurationProperties(prefix = SlaveDataSourceProperties.PREFIX)
public class SlaveDataSourceProperties implements DataSourceProperties {

    public static final String PREFIX = "datasource.slave";

    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int initialSize;
    private int maxActive;
    private int maxIdle;
    private int minIdle;
    private int maxWait;
}