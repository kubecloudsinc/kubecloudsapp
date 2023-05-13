package io.kubecloudsinc.kubecloudsapp.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DataSourceConfiguration {
    @Value("${spring.datasource.driver-class-name}")
    String databaseDriver;
    @Value("${spring.datasource.url}")
    String dataSourceURL;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(databaseDriver);
        dataSourceBuilder.url(dataSourceURL);
        dataSourceBuilder.username(userName);
        dataSourceBuilder.password(password);
        log.info("Connection Success");
        return dataSourceBuilder.build();
    }
}
