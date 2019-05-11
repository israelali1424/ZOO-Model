package edu.albany.Project.Zoo.aniamal.Fish;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Shark<T> extends Fish<Shark> implements AnimalActions {

  private static int SharkCount = 1;
  public int SharkId;
  // List of all shark i the zoo
  private static ArrayList<Shark> SharkList = new ArrayList<Shark>();

  public static ArrayList<Shark> getSharkList() {
    return SharkList;
  }

  public static void setSharkList(ArrayList<Shark> sharkList) {
    SharkList = sharkList;
  }

  public Shark(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    SharkId = SharkCount++;
    SharkList.add(this);
  }

  public void printSharkList() {
    this.print(SharkList);
  }

  public void removeFromZoo() {
    SharkList.remove(this);
    Fish.getFishList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getSharkId() {
    return SharkId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Shark Sound");
  }

  @Override
  public void move() {
    String move = String.format("%s the Shark  has sawm to the other side of the the fish tank ", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static void PrintSharkList() {
    Shark.printAnimalArray(SharkList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Shark.getListSize(SharkList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Shark ");
  }

}
