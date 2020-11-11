package com.wozu.mySQLHerokuDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("/app.properties")
public class Config {

    @Autowired
    Environment env;

}
