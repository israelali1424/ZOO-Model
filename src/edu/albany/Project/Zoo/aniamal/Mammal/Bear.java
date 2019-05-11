package edu.albany.Project.Zoo.aniamal.Mammal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Bear<T> extends Mammal<T> implements AnimalActions {
  private static int BearCount = 1;
  public int BearId;
  private static ArrayList<Bear> BearList = new ArrayList<Bear>();

  public Bear(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    BearList.add(this);
    BearId = BearCount++;
  }

  public void removeFromZoo() {
    BearList.remove(this);
    Mammal.getMammalList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getBearId() {
    return BearId;
  }

  public void printBearist() {
    this.print(BearList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Bear.getListSize(BearList);
  }

  public static ArrayList<Bear> getBearList() {
    return BearList;
  }

  public static void setBearList(ArrayList<Bear> BearList) {
    BearList = BearList;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Growl");
  }

  @Override
  public void move() {
    String move = String.format("%s the Bear trying to attack a humman a ZooKeeper has Stopped them",
        this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Bear ");
  }
}
