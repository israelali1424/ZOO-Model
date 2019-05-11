package edu.albany.Project.Zoo.aniamal.Mammal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class SipderMonkey<T> extends Mammal<T> implements AnimalActions {
  private static int SipderMonkeyCount = 1;
  public int SipderMonkeyId;
  private static ArrayList<SipderMonkey> SipderMonkeyList = new ArrayList<SipderMonkey>();

  public SipderMonkey(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    SipderMonkeyList.add(this);
    SipderMonkeyId = SipderMonkeyCount++;
  }

  public void removeFromZoo() {
    SipderMonkeyList.remove(this);
    Mammal.getMammalList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getSipderMonkeyId() {
    return SipderMonkeyId;
  }

  public void printSipderMonkeyist() {
    this.print(SipderMonkeyList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return SipderMonkey.getListSize(SipderMonkeyList);
  }

  public static ArrayList<SipderMonkey> getSipderMonkeyList() {
    return SipderMonkeyList;
  }

  public static void setSipderMonkeyList(ArrayList<SipderMonkey> SipderMonkeyList) {
    SipderMonkeyList = SipderMonkeyList;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Kekeekeeeee");
  }

  @Override
  public void move() {
    String move = String.format("%s the SipderMonkey is climbing a tree", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the SipderMonkey ");
  }
}
