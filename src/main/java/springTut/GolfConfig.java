package springTut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolfConfig {

    @Bean
    public FortuneService awesomeFortuneService(){
        return new AwesomeFortuneService();
    }

    @Bean
    public Coach golfCoach(){
        return new GolfCoach(awesomeFortuneService());
    }
}
