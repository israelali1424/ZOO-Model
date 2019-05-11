package edu.albany.Project.Zoo.aniamal.Mammal;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Tiger<T> extends Mammal<T> implements AnimalActions {
  private static int TigerCount = 1;
  public int TigerId;
  private static ArrayList<Tiger> TigerList = new ArrayList<Tiger>();

  public Tiger(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    TigerList.add(this);
    TigerId = TigerCount++;
  }

  public void removeFromZoo() {
    TigerList.remove(this);
    Mammal.getMammalList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getTigerId() {
    return TigerId;
  }

  public void printTigerist() {
    this.print(TigerList);
  }

  // Return an int with size of a list without the parameter
  public static int getListsize() {
    return Tiger.getListSize(TigerList);
  }

  public static ArrayList<Tiger> getTigerList() {
    return TigerList;
  }

  public static void setTigerList(ArrayList<Tiger> TigerList) {
    TigerList = TigerList;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Snnnnnnnnarl");
  }

  @Override
  public void move() {
    String move = String.format("%s the Tiger is stalking a human from behind the glass", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Tiger ");
  }
}
