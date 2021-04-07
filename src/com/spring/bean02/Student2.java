package src.com.spring.bean02;

public class Student2 {
    private String username;
    private int password;

    public Student2(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public Student2() {
    }

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

    @Override
    public String toString() {
        return "Student2{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
