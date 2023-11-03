package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.ilyashtiryov.spring.rest")
public class MyConfig {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
