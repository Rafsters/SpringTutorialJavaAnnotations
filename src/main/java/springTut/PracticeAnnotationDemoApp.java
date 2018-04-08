package springTut;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Coach theCoach = context.getBean("basketballCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
