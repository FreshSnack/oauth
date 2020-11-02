package net.ruixin.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author Administrator
 * exclude SecurityAutoConfiguration 移除spring security配置
 */
//@EnableConfigurationProperties
@SpringBootApplication/*(exclude={SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class})*/
public class OauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }

}
