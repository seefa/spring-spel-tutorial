package ir.seefa.tutorial.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 08 Sep 2020 T 14:05:23
 */
@Component
public class User {

    private String name;
    private Character gender;
    private String email;
    private String email2;

    public User() {
        System.out.println("User constructor called.");

        name = "Saman Delfani";
        gender = 'M';
        email = "fakeEmail";
        email2 = "info@seefa.ir";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}
