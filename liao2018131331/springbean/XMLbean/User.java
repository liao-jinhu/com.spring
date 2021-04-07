package liao2018131331.springbean.XMLbean;
import java.util.List;
public class User {
    private String username;
    private int password;
    private List<String> list;
    public User(String username, int password, List<String> list) {
        this.username = username;
        this.password = password;
        this.list = list;
    }
    public User() {
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
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
