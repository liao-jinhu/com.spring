package liao2018131331.spring.teacherProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String Path ="liao2018131331/spring/teacherProject/bean1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
        Teacher teacher1 = (Teacher) applicationContext.getBean("teacher1");
        System.out.println(teacher1);

        Teacher teacher2 = (Teacher) applicationContext.getBean("teacher2");
        System.out.println(teacher2);
    }
}
