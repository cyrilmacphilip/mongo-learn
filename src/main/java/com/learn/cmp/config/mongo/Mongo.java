package com.learn.cmp.config.mongo;

import com.mongodb.ConnectionString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@Configuration
public class Mongo {

    @Bean
    public MongoClientFactoryBean mongoCustom() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setConnectionString(mongoConnectionString());
        return mongo;
    }

    private ConnectionString mongoConnectionString() {
        return new ConnectionString("mongodb+srv://cyril-test:98kueb27t9O9RZfb@cluster0.55em1.mongodb.net/myFirstDatabase");
    }
}
