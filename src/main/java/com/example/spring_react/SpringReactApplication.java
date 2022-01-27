package com.example.spring_react;

import com.example.spring_react.entity.Client;
import com.example.spring_react.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactApplication.class, args);
    }

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void run(String... args) throws Exception {
        this.clientRepository.save(new Client("Ramesh", "ramesh@gmail.com"));
        this.clientRepository.save(new Client("Tom", "tom@gmail.com"));
        this.clientRepository.save(new Client("Tony", "tony@gmail.com"));
    }

}
