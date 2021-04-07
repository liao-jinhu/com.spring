package liao2018131331.springbean.annotation01;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    public  void save(){
        System.out.println("这是业务层-----");
    }
}
