package src.com.spring.annotation02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    @Value("廖进湖")
    public String username;
    public int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }
    @Value("123456")
    public void setPassword(int password) {
        this.password = password;
    }

}
