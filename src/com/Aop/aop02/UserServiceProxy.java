package src.com.Aop.aop02;

import src.com.spring.annotation02.UserServic;

public class UserServiceProxy implements UserService {
    private  UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }
    public void add() {
        log("add");
        userService.add();

    }

    public void delete() {
        log("delete");
        userService.delete();

    }

    public void select() {
        log("select");
        userService.select();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
