package src.com.spring.bean01;

public class User2 {
    private  String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void show(){
        System.out.println("用户名：" +username+"  密码："+password );
    }
}
