package com.example.demo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/animal")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimals() {
        return animalService.getAnimals();

    }

    @PostMapping
    public void registerNewAnimal(
            @RequestBody Animal animal) {
        animalService.addNewAnimal(animal);
    }

    @DeleteMapping(path = "{animalId}")
    public void deleteAnimal(
            @PathVariable("animalId") Long animalId) {
        animalService.deleteAnimal(animalId);
    }

    @PutMapping(path = "{animalId}")
    public void updateAnimal(
            @PathVariable("animalId") Long animalId,
            @RequestParam(required = false) String tesyId,
            @RequestParam(required = false) String fromWhere,
            @RequestParam(required = false) String animal,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String typeOfAnimal,
            @RequestParam(required = false) String age,
            @RequestParam(required = false) String color,
            @RequestParam(required = false) String sex,
            @RequestParam(required = false) String situation,
            @RequestParam(required = false) String chipNumber,
            @RequestParam(required = false) String note
    ){
        animalService.updateAnimal(animalId,tesyId,fromWhere,animal,name,typeOfAnimal, age, color,sex,situation,chipNumber,note);
    }
}
