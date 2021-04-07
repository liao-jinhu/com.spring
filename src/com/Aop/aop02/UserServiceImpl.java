package src.com.Aop.aop02;

import src.com.spring.annotation02.UserServic;

public class UserServiceImpl  implements UserService {
    public void add() {
        System.out.println("增加一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");

    }

    public void select() {
        System.out.println("查询用户");
    }
}
