package ir.seefa.tutorial.spring;

import ir.seefa.tutorial.spring.bean.User;
import ir.seefa.tutorial.spring.bean.UserService;
import ir.seefa.tutorial.spring.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 08 Sep 2020 T 13:42:26
 */
public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user = context.getBean(User.class);
        UserService userService = context.getBean(UserService.class);

        System.out.println(user.getName() + (userService.isValidName() ? " is valid name." : " is invalid name."));
        System.out.println(user.getGender() + (userService.isValidGender() ? " is valid gender character." : " is invalid gender character."));
        System.out.println(user.getEmail() + (userService.isValidEmail() ? " is valid email." : " is invalid email."));
        System.out.println(user.getEmail2() + (userService.isValidEmail2() ? " is valid email." : " is invalid email."));
    }
}
