package ir.seefa.tutorial.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 07 Sep 2020 T 02:14:58
 */
@Service
public class UserService {
    @Value("#{user.name matches '[a-zA-Z\\s]{3,50}'}")
    private boolean validName;
    @Value("#{user.gender matches '[M|F]'}")
    private boolean validGender;
    @Value("#{user.email matches '^[\\w!#$%&*+/=?`{|}~^-]+(?:\\.[\\w!#$%&*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$'}")
    private boolean validEmail;
    @Value("#{user.email2 matches '^[\\w!#$%&*+/=?`{|}~^-]+(?:\\.[\\w!#$%&*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$'}")
    private boolean validEmail2;

    public UserService() {
        System.out.println("UserService constructor called.");
    }

    public boolean isValidName() {
        return validName;
    }

    public boolean isValidGender() {
        return validGender;
    }

    public boolean isValidEmail() {
        return validEmail;
    }

    public boolean isValidEmail2() {
        return validEmail2;
    }
}
