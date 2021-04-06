package com.learning.DogRestApi.Service;

import com.learning.DogRestApi.Exception.DogNotFoundException;
import com.learning.DogRestApi.Repository.DogRepository;
import com.learning.DogRestApi.entity.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }
    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        /*return (String) dogRepository.findBreedById(id);*/
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        return optionalBreed.orElseThrow(DogNotFoundException::new);

    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
