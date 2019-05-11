package edu.albany.Project.Zoo.aniamal.Fish;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Seahorse<T> extends Fish<Seahorse> implements AnimalActions {

  private static int SeahorseCount = 1;
  public int SeahorseId;
  // List of all Seahorse i the zoo
  private static ArrayList<Seahorse> SeahorseList = new ArrayList<Seahorse>();

  public static ArrayList<Seahorse> getSeahorseList() {
    return SeahorseList;
  }

  public static void setSeahorseList(ArrayList<Seahorse> SeahorseList) {
    SeahorseList = SeahorseList;
  }

  public Seahorse(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    SeahorseId = SeahorseCount++;
    SeahorseList.add(this);
  }

  public void printSeahorseList() {
    this.print(SeahorseList);
  }

  public void removeFromZoo() {
    SeahorseList.remove(this);
    Fish.getFishList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getSeahorseId() {
    return SeahorseId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Seahorse Sound");
  }

  @Override
  public void move() {
    String move = String.format("%s the Seahorse  has sawm to the other side of the the fish tank ",
        this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static void PrintSeahorseList() {
    Seahorse.printAnimalArray(SeahorseList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Seahorse.getListSize(SeahorseList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Seahorse ");
  }

}
