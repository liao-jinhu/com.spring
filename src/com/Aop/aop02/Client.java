package src.com.Aop.aop02;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        UserServiceImpl userService = new UserServiceImpl();
        userServiceProxy.setUserService(userService);

        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.select();
    }
}
