package src.com.spring.bean01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/com/spring/bean01/applicationContext.xml");
        User user1 = (User) applicationContext.getBean("user1");
        User user01 = (User) applicationContext.getBean("user1");
        //user bean1 范围单例 singleton
        System.out.println(user1.hashCode());
        System.out.println(user01.hashCode());
        user1.show();

        //user2 bean2 范围原例 prototye
        User2 user2 = (User2) applicationContext.getBean("user2");
        User2 user02 = (User2) applicationContext.getBean("user2");
        System.out.println(user2.hashCode());
        System.out.println(user02.hashCode());
        user2.show();


    }
}
