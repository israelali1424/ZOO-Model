package edu.albany.Project.Zoo.aniamal.Bird;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Flamingo extends Bird implements AnimalActions {
  private static int FlamingoCount = 1;
  public int FlamingoId;
  private static ArrayList<Flamingo> FlamingoList = new ArrayList<Flamingo>();

  public Flamingo(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    FlamingoId = FlamingoCount++;
    FlamingoList.add(this);
  }

  public int getFlamingoId() {
    return FlamingoId;
  }

  public void removeFromZoo() {
    FlamingoList.remove(this);
    Bird.getBirdList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public void printFlamingoist() {
    this.print(FlamingoList);
  }

  public static ArrayList<Flamingo> getFlamingoList() {
    return FlamingoList;
  }

  public static void setFlamingoList(ArrayList<Flamingo> FlamingoList) {
    FlamingoList = FlamingoList;
  }

  public static int getListsize() {
    return Flamingo.getListSize(FlamingoList);
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Goooo");
  }

  @Override
  public void move() {
    String move = String.format("%s the Flamingo dacnes in the pond", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Flamingo ");
  }
}
