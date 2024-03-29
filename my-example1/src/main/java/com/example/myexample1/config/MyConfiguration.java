package com.example.myexample1.config;

import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.ConfigurationSource;
import org.neo4j.ogm.session.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(
        basePackages = "com.example.myexample1.repository"
)
@EnableTransactionManagement
public class MyConfiguration {

    private final Logger logger = LoggerFactory.getLogger(MyConfiguration.class);
    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        ConfigurationSource properties = new ClasspathConfigurationSource(
                "db.properties");
        logger.info("init");
        return new org.neo4j.ogm.config.Configuration.Builder(properties).build();
    }

}
