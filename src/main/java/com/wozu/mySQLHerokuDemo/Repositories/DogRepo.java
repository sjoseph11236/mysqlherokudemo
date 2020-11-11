package com.wozu.mySQLHerokuDemo.Repositories;

import com.wozu.mySQLHerokuDemo.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {}
