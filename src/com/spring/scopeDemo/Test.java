package src.com.spring.scopeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext bean = new ClassPathXmlApplicationContext("src/com/spring/scopeDemo/bean1.xml");
        //userDao1 bean1 范围单例 singleton
        //userDao2 bean2 范围原例 prototye
        UserDao userDao1 = (UserDao) bean.getBean("bean1");
        UserDao userDao01 = (UserDao) bean.getBean("bean1");
        UserDao userDao2 = (UserDao) bean.getBean("bean2");
        UserDao userDao02 = (UserDao) bean.getBean("bean2");
        System.out.println("-----单例-----");
        System.out.println(userDao1);
        System.out.println(userDao01);
        System.out.println("-----原例-----");
        System.out.println(userDao2);
        System.out.println(userDao02);
    }
}
