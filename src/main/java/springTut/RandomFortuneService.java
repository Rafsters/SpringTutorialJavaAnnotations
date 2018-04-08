package springTut;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    public String[] data = {"Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck","The journey is the reward"};

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        return data[myRandom.nextInt(data.length)];
    }
}
