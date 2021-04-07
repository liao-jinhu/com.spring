package src.com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/com/spring/autowire/bean1.xml");
        People people = (People) applicationContext.getBean("people");

        people.getCat().shout();
        people.getDog().shout();
        people.People();
        //System.out.println(people.toString());
    }
}
