package liao2018131331.spring.ioc01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String Path="liao2018131331/spring/ioc01/bean1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
        UserService userService = (UserService) applicationContext.getBean("userservice");
        userService.say();

    }
}
