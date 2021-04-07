package src.com.spring.bean02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/com/spring/bean02/bean1.xml");
        Student student = (Student) applicationContext.getBean("student");
        Student2 student1 = (Student2) applicationContext.getBean("student1");
        Student2 student2 = (Student2) applicationContext.getBean("student2");
        System.out.println(student.toString());
        System.out.println(student1);
        System.out.println(student2);




    }
}
