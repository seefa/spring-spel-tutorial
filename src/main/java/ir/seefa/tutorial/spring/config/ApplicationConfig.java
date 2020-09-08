package ir.seefa.tutorial.spring.config;

import org.springframework.context.annotation.*;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:17:15
 */
@Configuration
@ComponentScan(basePackages = {"ir.seefa.tutorial.spring"})
//@PropertySource(value = "application.properties", ignoreResourceNotFound = true)
public class ApplicationConfig {
}
