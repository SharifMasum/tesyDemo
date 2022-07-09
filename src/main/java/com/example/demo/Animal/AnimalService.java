package com.example.demo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public void addNewAnimal(Animal animal) {
        Optional<Animal> animalOptional = animalRepository.
                findAnimalByTesyId(animal.getTesyId());
        if (animalOptional.isPresent()) {
            throw new IllegalStateException(("Tesy ID is taken"));
        }
        animalRepository.save(animal);
    }

    public void deleteAnimal(Long animalId) {
        boolean exists = animalRepository.existsById(animalId);
        if(!exists) {
            throw new IllegalStateException(
                    "Animal with id " + animalId + " does not exists");
        }
        animalRepository.deleteById(animalId);
    }

    @Transactional
    public void updateAnimal(Long animalId, String tesyId,
                             String fromWhere, String animal,
                             String name, String typeOfAnimal,
                             String age, String color, String sex,
                             String situation, String chipNumber,
                             String note) {
        Animal foundAnimal = animalRepository.findById(animalId)
                .orElseThrow(() -> new IllegalStateException(
                        "Animal with id " + animalId + " does not exists"));

        if (tesyId != null &&
                tesyId.length() > 0 &&
                !Objects.equals(foundAnimal.getTesyId(), tesyId)) {
            Optional<Animal> animalOptional = animalRepository
                    .findAnimalByTesyId(tesyId);
            if (animalOptional.isPresent()) {
                throw new IllegalStateException(("Tesy ID is taken"));
            }
            foundAnimal.setTesyId(tesyId);
        }
        if (fromWhere != null && fromWhere.length()>0 &&
                !Objects.equals(foundAnimal.getFromWhere(), fromWhere)){
            foundAnimal.setFromWhere(fromWhere);
        }
        if (animal != null && animal.length()>0 &&
                !Objects.equals(foundAnimal.getAnimal(), animal)){
            foundAnimal.setAnimal(animal);
        }
        if (name != null && name.length()>0 &&
                !Objects.equals(foundAnimal.getName(), name)){
            foundAnimal.setName(name);
        }
        if (typeOfAnimal != null && typeOfAnimal.length()>0 &&
                !Objects.equals(foundAnimal.getTypeOfAnimal(), typeOfAnimal)){
            foundAnimal.setTypeOfAnimal(typeOfAnimal);
        }
        if (age != null && age.length()>0 &&
                !Objects.equals(foundAnimal.getAge(), age)){
            foundAnimal.setAge(age);
        }
        if (color != null && color.length()>0 &&
                !Objects.equals(foundAnimal.getColor(), color)){
            foundAnimal.setColor(color);
        }
        if (sex != null && sex.length()>0 &&
                !Objects.equals(foundAnimal.getSex(), sex)){
            foundAnimal.setSex(sex);
        }
        if (situation != null && situation.length()>0 &&
                !Objects.equals(foundAnimal.getSituation(), situation)){
            foundAnimal.setSituation(situation);
        }
        if (chipNumber != null && chipNumber.length()>0 &&
                !Objects.equals(foundAnimal.getChipNumber(), chipNumber)){
            foundAnimal.setChipNumber(chipNumber);
        }
        if (note != null && note.length()>0 &&
                !Objects.equals(foundAnimal.getNote(), note)){
            foundAnimal.setNote(note);
        }

    }
}
