package com.aisino;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by zhukaishengy on 2018/4/2.
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {
//    用于war打包
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).run(args);
    }
}
