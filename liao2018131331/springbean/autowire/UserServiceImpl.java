package liao2018131331.springbean.autowire;

import src.com.spring.annotation02.UserServic;

public class UserServiceImpl implements UserService {
    private  UserDao userDao;
    public void  save(){
        this.userDao.save();
        System.out.println("这是控制层----");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
