package src.com.spring03.jdk;

public class JdkTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUse();
        userDao1.delectUser();
    }
}
