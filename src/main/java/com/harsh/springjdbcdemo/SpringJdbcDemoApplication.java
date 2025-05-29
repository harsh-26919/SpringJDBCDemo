package com.harsh.springjdbcdemo;

import com.harsh.springjdbcdemo.model.Alien;
import com.harsh.springjdbcdemo.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.setId(111);
        alien.setName("Harsh1");
        alien.setTech("Java");

        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien);
        System.out.println(repo.findAll());

    }

}
