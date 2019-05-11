package edu.albany.Project.Zoo.aniamal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public abstract class ZooAnimal<T> implements AnimalActions {

  private String animalName;
  private Gender animalGender;
  private AnimalType type;
  protected Zoo zoo;
  private static int ZooCount = 1;
  public int ZooAnimalCount;
  private Species species;

  public ZooAnimal(String name, Gender gender, AnimalType animalType, Species animal, Zoo zoo) {
    this.animalName = name;
    this.animalGender = gender;
    this.type = animalType;
    this.species = animal;
    this.zoo = zoo;
    this.zoo.addAnimal(this);
    ZooAnimalCount = ZooCount++;

  }

  public enum Gender {
    Male, Female;
  }

  public enum AnimalType {
    Mammal, Reptile, Fish, Bird;
  }

  public enum Species {
    /* Birds */ Tucan, Eagle, Flamingo, Owl, /* Reptiels */ Python, Turtle, Crocodile, /* Mammaels */Lion, Tiger, Bear, SpiderMonkey, /*
                                                                                                                                       * Fish
                                                                                                                                       */ Shark, BlueTang, Seahorse;
  }

  // Print a list that used for any main animal type { Mammal, Reptile, Fish,
  // Bird;}
  public static <T> void printAnimalArray(ArrayList<T> inputArray) {
    // display array elements
    for (T element : inputArray)
      System.out.printf("%s ", element);
    System.out.println();
  }

  // Print list used for no static methods
  public <T> void print(ArrayList<T> inputArray) {
    // display array elements
    for (T element : inputArray)
      System.out.printf("%s ", element);
    System.out.println();
  }

  public static <T> void addAnimal(ArrayList<T> inputArray, T animal) {
    inputArray.add(animal);
  }

  public static <T> void removeAnimal(ArrayList<T> inputArray, T animal) {
    inputArray.remove(animal);
  }

  public static <T> int getListSize(ArrayList<T> inputArray) {
    return inputArray.size();
  }

  public int getZooAnimalCount(String name) {
    this.animalName = name;
    return ZooAnimalCount;
  }

  @Override
  public abstract void makeNoise();

  @Override
  public abstract void move();

  @Override
  public String toString() {
    return String.format("%s is in the Zoo and h", this.animalName);
  }

  public Gender getAnimalGender() {
    return animalGender;
  }

  public void setAnimalGender(Gender animalGender) {
    this.animalGender = animalGender;
  }

  public String getAnimalName() {
    return animalName;
  }

  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  public int getZooAnimalCount() {
    return ZooAnimalCount;
  }

  public void setZooAnimalCount(int zooAnimalCount) {
    ZooAnimalCount = zooAnimalCount;
  }

  public AnimalType getAnimalType() {
    return type;
  }

  public Species getSpecies() {
    return species;
  }

  public void setSpecies(Species species) {
    this.species = species;
  }

}
