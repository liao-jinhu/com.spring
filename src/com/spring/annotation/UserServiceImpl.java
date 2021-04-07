package src.com.spring.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Resource(name = "userDao")
    private UserDao userDao;
    public  void save() {
            this.userDao.save();
            System.out.println("UserService.....save.....");
    }
}
