package edu.albany.Project.Zoo.aniamal.Bird;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;
import edu.albany.Project.Zoo.aniamal.Fish.Fish;

public abstract class Bird<T> extends ZooAnimal<T> implements AnimalActions {
  private static ArrayList<Bird> BirdList = new ArrayList<Bird>();
  private static int BirdCount = 1;
  public int BirdId;

  public Bird(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    Bird.addAnimal(BirdList, this);
    BirdId = BirdCount++;
  }

  public static void PrintBirdList() {
    Fish.printAnimalArray(BirdList);
  }

  public static ArrayList<Bird> getBirdList() {
    return BirdList;
  }

  public static void setBirdList(ArrayList<Bird> birdList) {
    BirdList = birdList;
  }

  public static int getListsize() {
    return Bird.getListSize(BirdList);
  }

  // This method overrides show() of Parent

  @Override
  public abstract void makeNoise();

  @Override
  public abstract void move();

}
