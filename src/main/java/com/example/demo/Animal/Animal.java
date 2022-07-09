package com.example.demo.Animal;

import javax.persistence.*;

@Entity
@Table
public class Animal {
    @Id
    @SequenceGenerator(
            name= "animal_sequence",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_sequence"
    )
    private Long id;
    private String tesyId;
    private String dateOfArrival;
    private String fromWhere;
    private String animal;
    private String name;
    private String typeOfAnimal;
    private String age;
    private String color;
    private String sex;
    private String situation;
    private String dateOfDeparture;
    private String chipNumber;
    private String note;

    public Animal() {
    }

    public Animal(Long id, String tesyId, String dateOfArrival,
                  String fromWhere, String animal, String name,
                  String typeOfAnimal, String age, String color,
                  String sex, String situation, String dateOfDeparture,
                  String chipNumber, String note) {
        this.id = id;
        this.tesyId = tesyId;
        this.dateOfArrival = dateOfArrival;
        this.fromWhere = fromWhere;
        this.animal = animal;
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.situation = situation;
        this.dateOfDeparture = dateOfDeparture;
        this.chipNumber = chipNumber;
        this.note = note;
    }

    public Animal(String tesyId, String dateOfArrival,
                  String fromWhere, String animal, String name,
                  String typeOfAnimal, String age, String color,
                  String sex, String situation, String dateOfDeparture,
                  String chipNumber, String note) {
        this.tesyId = tesyId;
        this.dateOfArrival = dateOfArrival;
        this.fromWhere = fromWhere;
        this.animal = animal;
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.situation = situation;
        this.dateOfDeparture = dateOfDeparture;
        this.chipNumber = chipNumber;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTesyId() {
        return tesyId;
    }

    public void setTesyId(String tesyId) {
        this.tesyId = tesyId;
    }

    public String getDateOfArrival() {return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", tesyId='" + tesyId + '\'' +
                ", dateOfArrival=" + dateOfArrival +
                ", fromWhere='" + fromWhere + '\'' +
                ", animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", sex='" + sex + '\'' +
                ", situation='" + situation + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", chipNumber='" + chipNumber + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
