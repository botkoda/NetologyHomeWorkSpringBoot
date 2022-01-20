package netology_homework_springboot.Config;

import netology_homework_springboot.service.DevProfile;
import netology_homework_springboot.service.ProductionProfile;
import netology_homework_springboot.service.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    @ConditionalOnProperty(prefix = "netology.profile" , name = "dev",havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile" , name = "dev",havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
