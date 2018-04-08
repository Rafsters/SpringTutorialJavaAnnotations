package springTut;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        //retrieve bean form spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach.equals(alphaCoach));

        System.out.println("Memory location same?: " + result);
        System.out.println(theCoach);
        System.out.println(alphaCoach);


    }
}
