package edu.albany.Project.Zoo.aniamal.Fish;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class BlueTang<T> extends Fish<BlueTang> implements AnimalActions {

  private static int BlueTangCount = 1;
  public int BlueTangId;
  // List of all BlueTang i the zoo
  private static ArrayList<BlueTang> BlueTangList = new ArrayList<BlueTang>();

  public static ArrayList<BlueTang> getBlueTangList() {
    return BlueTangList;
  }

  public static void setBlueTangList(ArrayList<BlueTang> BlueTangList) {
    BlueTangList = BlueTangList;
  }

  public BlueTang(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    BlueTangId = BlueTangCount++;
    BlueTangList.add(this);
  }

  public void printBlueTangList() {
    this.print(BlueTangList);
  }

  public void removeFromZoo() {
    BlueTangList.remove(this);
    Fish.getFishList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getBlueTangId() {
    return BlueTangId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("BlueTang Sound");
  }

  @Override
  public void move() {
    String move = String.format("%s the BlueTang  gave Birth ", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static void PrintBlueTangList() {
    BlueTang.printAnimalArray(BlueTangList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return BlueTang.getListSize(BlueTangList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the BlueTang ");
  }

}
