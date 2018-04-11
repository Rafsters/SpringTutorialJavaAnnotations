package springTut;

public class AwesomeFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is an awesome day";
    }
}
