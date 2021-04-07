package liao2018131331.spring.ioc02;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("bean3工厂实例化中");
    }

    public Bean3 createrBean(){
        return  new Bean3();
    }
}
