package liao2018131331.spring.ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("liao2018131331/spring/ioc02/beans1.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1);

    }
}
