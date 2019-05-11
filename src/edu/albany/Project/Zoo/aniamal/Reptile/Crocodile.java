package edu.albany.Project.Zoo.aniamal.Reptile;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Crocodile<T> extends Reptile<T> implements AnimalActions {
  private static int PyCount = 1;
  public int CrocodileId;
  private static ArrayList<Crocodile> CrocodileList = new ArrayList<Crocodile>();

  public Crocodile(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    CrocodileList.add(this);
    CrocodileId = PyCount++;
  }

  public void removeFromZoo() {
    CrocodileList.remove(this);
    Reptile.getReptileList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getCrocodileId() {
    return CrocodileId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Bellowwwwww");
  }

  // public void printCrocodileList() {
  // this.print(CrocodileList);
  // }

  @Override
  public void move() {
    String move = String.format("%s the Crocodile  sits lazily in the swamp ", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static ArrayList<Crocodile> getCrocodileList() {
    return CrocodileList;
  }

  public static void setCrocodileList(ArrayList<Crocodile> CrocodileList) {
    CrocodileList = CrocodileList;
  }

  public static int getListsize() {
    return Crocodile.getListSize(CrocodileList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Crocodile ");

  }

}
