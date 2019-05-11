package edu.albany.Project.Zoo.aniamal.Reptile;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;
import edu.albany.Project.Zoo.aniamal.Fish.Fish;

public abstract class Reptile<T> extends ZooAnimal<T> implements AnimalActions {

  private static int RepCount = 1;
  public int ReptileId;
  private static ArrayList<Reptile> ReptileList = new ArrayList<Reptile>();

  public Reptile(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    Reptile.addAnimal(ReptileList, this);

    ReptileId = RepCount++;
  }

  public static void PrintReptileList() {
    Fish.printAnimalArray(ReptileList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Reptile.getListSize(ReptileList);
  }

  public int getReptileId() {
    return ReptileId;
  }

  @Override
  public abstract void makeNoise();

  @Override
  public abstract void move();

  public static ArrayList<Reptile> getReptileList() {
    return ReptileList;
  }

  public static void setReptileList(ArrayList<Reptile> reptileList) {
    ReptileList = reptileList;
  }
}
