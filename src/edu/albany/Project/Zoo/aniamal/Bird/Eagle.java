package edu.albany.Project.Zoo.aniamal.Bird;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Eagle extends Bird implements AnimalActions {
  private static int EagleCount = 1;
  public int EagleId;
  private static ArrayList<Eagle> EagleList = new ArrayList<Eagle>();

  public Eagle(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    EagleId = EagleCount++;
    EagleList.add(this);
  }

  public int getEagleId() {
    return EagleId;
  }

  public void removeFromZoo() {
    EagleList.remove(this);
    Bird.getBirdList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public void printEagleist() {
    this.print(EagleList);
  }

  public static ArrayList<Eagle> getEagleList() {
    return EagleList;
  }

  public static void setEagleList(ArrayList<Eagle> EagleList) {
    EagleList = EagleList;
  }

  public static int getListsize() {
    return Eagle.getListSize(EagleList);
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Ca CAAAAAAAAA");
  }

  @Override
  public void move() {
    String move = String.format("%s the Eagle has flown 400 feet in the air ", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Eagle ");
  }
}
