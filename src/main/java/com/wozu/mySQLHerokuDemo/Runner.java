package com.wozu.mySQLHerokuDemo;

import com.wozu.mySQLHerokuDemo.Models.Dog;
import com.wozu.mySQLHerokuDemo.Repositories.DogRepo;
import com.wozu.mySQLHerokuDemo.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    DogServiceImpl dogServiceimpl;

    @Override
    public void run(String... args) throws Exception {

            Dog dog1 = new Dog("dummy message 1", "SUCCESS");
            Dog dog2 = new Dog("dummy message 2", "SUCCESS");

            dogServiceimpl.postDogFromDogApi(dog1);
            dogServiceimpl.postDogFromDogApi(dog2);



    }
}