package src.com.Aop.aop03;

public class UserDaoImpl implements UserDao{
    public void addUser() {
        System.out.println("删除了一个用户");
    }

    public void deleteUser() {
        System.out.println("增加了一个用户");

    }
}
