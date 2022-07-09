package com.example.demo.Animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            AnimalRepository repository) {
        return  args -> {
            Animal cat = new Animal(
                    "2456/89",
                    "2022-07-04",
                    "Naantali",
                    "cat",
                    "Saima",
                    "pet",
                    "1 year",
                    "black",
                    "female",
                    "very bad",
                    "2022-07-10",
                    "456fg7",
                    "She is in very bad situation"
            );

            Animal otherPet = new Animal(
                    "6784/65",
                    "2022-06-25",
                    "Kaarina",
                    "dog",
                    "Mikko",
                    "pet",
                    "2 year",
                    "white",
                    "male",
                    "bad",
                    "2022-07-05",
                    "hye8u",
                    "He is in bad situation"
            );

            Animal wildAnimal = new Animal(
                    "6784/32",
                    "2022-06-27",
                    "Salo",
                    "rabbit",
                    "n/a",
                    "wild",
                    "adult",
                    "gray",
                    "female",
                    "very bad",
                    "2022-07-05",
                    "4thy5d",
                    "She is in very bad situation"
            );

            repository.saveAll(
                    List.of(cat, otherPet, wildAnimal)
            );
        };
    }
}
