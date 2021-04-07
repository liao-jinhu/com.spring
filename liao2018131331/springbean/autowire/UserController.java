package liao2018131331.springbean.autowire;

import src.com.spring.annotation02.UserServic;

public class UserController {

    private UserService userService;
    public void save(){
        this.userService.save();
        System.out.println("这是按制层--------");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
