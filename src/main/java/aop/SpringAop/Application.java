package aop.SpringAop;

import aop.demo.PersonSpring;
import aop.demo.Speakable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    private Speakable personSpring;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // spring aop
            System.out.println("******** spring aop ******** ");
            personSpring.sayHi();
            personSpring.sayBye();
            System.exit(0);
        };
    }

    @Bean
    public Speakable getPersonSpring(){
        return new PersonSpring();
    }
}
