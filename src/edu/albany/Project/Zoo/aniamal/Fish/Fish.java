package edu.albany.Project.Zoo.aniamal.Fish;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;

public abstract class Fish<T> extends ZooAnimal<T> implements AnimalActions {

  private static ArrayList<Fish> FishList = new ArrayList<Fish>();
  private static int FCount = 1;
  public int FishId;

  public Fish(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    Fish.addAnimal(FishList, this);
    FishId = FCount++;
  }

  public static void PrintFishList() {
    Fish.printAnimalArray(FishList);
  }

  public static ArrayList<Fish> getFishList() {
    return FishList;
  }

  public static void setFishList(ArrayList<Fish> fishList) {
    FishList = fishList;
  }

  public int getFishId() {
    return FishId;
  }

  @Override
  public abstract void makeNoise();

  @Override
  public abstract void move();

}
