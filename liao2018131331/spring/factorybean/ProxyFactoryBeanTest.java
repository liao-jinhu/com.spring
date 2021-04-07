package liao2018131331.spring.factorybean;

import liao2018131331.spring.jdk.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new
                ClassPathXmlApplicationContext("liao2018131331/spring/factorybean/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext1.getBean("userDaoProxy");
        userDao.add();
    }
}
