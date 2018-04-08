package springTut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;


    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis Coach: no-arg constructor");
    }

    // define my init method

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("TennisCoach: inside of doMyStartupStuff");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("TennisCoach: inside of doMyCleanupStuff");
    }

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside doSomeCrazyStuff method");
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
