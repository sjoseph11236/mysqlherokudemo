package com.wozu.mySQLHerokuDemo.Services;

import com.wozu.mySQLHerokuDemo.Models.Dog;

public interface DogService {
    public Dog getDogFromDogApi();
    public void postDogFromDogApi( Dog dog);
    public Iterable<Dog> getAllDogs();
}
