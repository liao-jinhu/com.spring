package liao2018131331.springbean.annotation01;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
@Controller("userController")
public class UserController {
    @Resource(name="userService")
    private UserService userServic;
    public void save(){
        this.userServic.save();
        System.out.println("这是控制层-----------");
    }

}
