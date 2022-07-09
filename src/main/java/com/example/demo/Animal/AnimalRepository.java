package com.example.demo.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepository
        extends JpaRepository<Animal, Long> {

    @Query("SELECT t FROM Animal t WHERE t.tesyId = ?1")
    Optional<Animal> findAnimalByTesyId(String tesyID);

}
