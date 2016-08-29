package io.haru.dummer.spring.config.property;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-14
 */
public interface DataSourceProperties {

    String getDriverClassName();
    String getUrl();
    String getUsername();
    String getPassword();
    int getInitialSize();
    int getMaxActive();
    int getMaxIdle();
    int getMinIdle();
    int getMaxWait();
}