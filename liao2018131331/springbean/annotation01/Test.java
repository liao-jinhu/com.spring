package liao2018131331.springbean.annotation01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("liao2018131331/springbean/annotation01/beans2.xml");
        UserController userController= (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
