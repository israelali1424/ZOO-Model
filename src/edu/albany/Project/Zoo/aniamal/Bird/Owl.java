package edu.albany.Project.Zoo.aniamal.Bird;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Owl extends Bird implements AnimalActions {
  private static int OwlCount = 1;
  public int OwlId;
  private static ArrayList<Owl> OwlList = new ArrayList<Owl>();

  public Owl(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    OwlId = OwlCount++;
    OwlList.add(this);
  }

  public int getOwlId() {
    return OwlId;
  }

  public void removeFromZoo() {
    OwlList.remove(this);
    Bird.getBirdList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public void printOwlist() {
    this.print(OwlList);
  }

  public static ArrayList<Owl> getOwlList() {
    return OwlList;
  }

  public static void setOwlList(ArrayList<Owl> OwlList) {
    OwlList = OwlList;
  }

  public static int getListsize() {
    return Owl.getListSize(OwlList);
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Hoooooo");
  }

  @Override
  public void move() {
    String move = String.format("%s the Owl turns it head 180 degrees", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Owl ");
  }
}
