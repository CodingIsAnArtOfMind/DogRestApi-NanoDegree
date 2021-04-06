package com.learning.DogRestApi.Service;

import com.learning.DogRestApi.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DogService {
    List<String> retrieveDogBreed();
    List<String> retrieveDogNames();
    String retrieveDogBreedById(Long id);
    List<Dog> retrieveDogs();
}
