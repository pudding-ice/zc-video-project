package com.myjava.service_video;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.myjava.service_video.mapper")
public class VideoApplication {
    private static final Logger LOG = LoggerFactory.getLogger(VideoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(VideoApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
