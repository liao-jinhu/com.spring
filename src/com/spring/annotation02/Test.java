package src.com.spring.annotation02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/com/spring/annotation02/beans.xml");
        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        System.out.println("--------------εε---------------");
        System.out.println(user.username);
        System.out.println(user.password);
        System.out.println(user);
        System.out.println(user1);


        System.out.println("---------------εδΎ--------------");
        UserServic service = (UserServic) applicationContext.getBean("UserService");
        UserServic service1 = (UserServic) applicationContext.getBean("UserService");
        System.out.println(service.books);
        System.out.println(service);
        System.out.println(service1);

    }
}
