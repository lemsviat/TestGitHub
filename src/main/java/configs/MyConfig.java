package configs;

import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat() {
        return new Cat();
    }
    @Bean ("dog")
    public Dog getDog() {
        return new Dog();
    }
    @Bean ("parrot-kesha")
    public Parrot getParrot() {
        return new Parrot();
    }
}
