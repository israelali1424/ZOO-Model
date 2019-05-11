package edu.albany.Project.Zoo.aniamal.Mammal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;

public abstract class Mammal<T> extends ZooAnimal<T> implements AnimalActions {

  private static int MCount = 1;
  public int mammalId;
  private static ArrayList<Mammal> MammalList = new ArrayList<Mammal>();

  public Mammal(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    Mammal.addAnimal(MammalList, this);
    mammalId = MCount++;
  }

  public static void PrintMammalList() {
    Mammal.printAnimalArray(MammalList);
  }

  public int getMammalId() {
    return mammalId;
  }

  public static int getListsize() {
    return Mammal.getListSize(MammalList);
  }

  @Override
  public abstract void makeNoise();

  @Override
  public abstract void move();

  public static ArrayList<Mammal> getMammalList() {
    return MammalList;
  }

  public static void setMammalList(ArrayList<Mammal> mammalList) {
    MammalList = mammalList;
  }

}
