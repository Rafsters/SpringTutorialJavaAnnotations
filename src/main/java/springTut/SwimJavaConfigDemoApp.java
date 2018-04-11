package springTut;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // Read the Spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from Spring Container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call some more methods ... has the props values injected

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        // Close the context
        context.close();
    }
}
