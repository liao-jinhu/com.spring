package liao2018131331.spring.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("liao2018131331/spring/ioc02/beans2.xml");
        System.out.println(applicationContext.getBean("beans2"));
    }
}
