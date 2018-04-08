package springTut;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // Read the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        // Get the bean from Spring Container
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        // Close the context
        context.close();
    }
}
