package io.haru.dummer.spring.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-08-14
 */
@Configuration
public class DataSourceConfig {
    private static final String DEFAULT_NAMING_STRATEGY = "org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy";

    // master

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "datasource.master")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {

        Map<String, String> propertiesHashMap = new HashMap<>();
        propertiesHashMap.put("hibernate.ejb.naming_strategy", DEFAULT_NAMING_STRATEGY);

        return builder.dataSource(masterDataSource())
                .packages("io.haru.dummer.spring.domain.master")
                .properties(propertiesHashMap)
                .build();
    }

    @Primary
    @Bean
    PlatformTransactionManager masterTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactory(builder).getObject());
    }

    @Configuration
    @EnableJpaRepositories(basePackages="io.haru.dummer.spring.domain.master",
            entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "masterTransactionManager")
    static class MasterJpaRepositoriesConfig {
    }


    // slave

    @Bean
    @ConfigurationProperties(prefix = "datasource.slave")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean slaveEntityManagerFactory(EntityManagerFactoryBuilder builder) {

        return builder.dataSource(slaveDataSource())
                .packages("io.haru.dummer.spring.domain.slave")
                .build();
    }

    @Bean
    @Primary
    PlatformTransactionManager slaveTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(slaveEntityManagerFactory(builder).getObject());
    }

    @Configuration
    @EnableJpaRepositories(
            basePackages="io.haru.dummer.spring.domain.slave",
            entityManagerFactoryRef = "slaveEntityManagerFactory",
            transactionManagerRef = "slaveTransactionManager")
    static class SlaveJpaRepositoriesConfig {
    }
}
