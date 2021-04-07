package src.com.Aop.aop01;

public class Demo {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();

        System.out.println("---------中介代理----------");

        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
