package liao2018131331.springbean.XMLbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("liao2018131331/springbean/XMLbean/beans01.xml");
        User user1 = (User) applicationContext.getBean("user1");
        System.out.println(user1);

        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user2);


     }
}
