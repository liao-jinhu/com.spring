package src.com.spring.annotation02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("UserService")
@Scope("singleton")
public class UserServic {
    @Value("Java EE")
    public String books;

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }
}
