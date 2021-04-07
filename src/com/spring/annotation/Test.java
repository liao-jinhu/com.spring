package src.com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/com/spring/annotation/bean2.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
