package src.com.spring.annotation;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserDaoImpl implements UserDao {

    public void save() {

        System.out.println("userdao....save....");
    }
}
