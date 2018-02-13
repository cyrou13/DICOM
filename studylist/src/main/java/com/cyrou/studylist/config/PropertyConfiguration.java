package com.cyrou.studylist.config;

import com.cyrou.studylist.beans.UserDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(
        @PropertySource("classpath:default.properties")
)
public class PropertyConfiguration {

    @Value("${studylist.default.username}")
    String username;

    @Bean
    public UserDataSource userDataSource(){
        UserDataSource userDataSource = new UserDataSource();
        userDataSource.setUsername(username);
        return userDataSource;
    }
}
