package springTut;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice throwing the ball into the basket ";
    }
}
