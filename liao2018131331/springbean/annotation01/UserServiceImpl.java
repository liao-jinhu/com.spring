package liao2018131331.springbean.annotation01;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements  UserService {
    @Resource(name="userDao")
    private UserDao userDao;
    public  void save(){
        this.userDao.save();
        System.out.println("这是数据层---------");
    }

}
