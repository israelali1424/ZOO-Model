package edu.albany.Project.Zoo.aniamal.Mammal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Lion<T> extends Mammal<T> implements AnimalActions {
  private static int LionCount = 1;
  public int LionId;
  private static ArrayList<Lion> LionList = new ArrayList<Lion>();

  public Lion(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    LionList.add(this);
    LionId = LionCount++;
  }

  public void removeFromZoo() {
    LionList.remove(this);
    Mammal.getMammalList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getLionId() {
    return LionId;
  }

  public void printLionist() {
    this.print(LionList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Lion.getListSize(LionList);
  }

  public static ArrayList<Lion> getLionList() {
    return LionList;
  }

  public static void setLionList(ArrayList<Lion> lionList) {
    LionList = lionList;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Roar");
  }

  @Override
  public void move() {
    String move = String.format("%s the lion has ran 40 metets", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Lion ");
  }
}
