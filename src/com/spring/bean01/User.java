package src.com.spring.bean01;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  void show(){
        System.out.println(username);
    }
}
