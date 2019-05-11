package edu.albany.Project.Zoo.aniamal.Bird;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Tucan extends Bird implements AnimalActions {
  private static int TucanCount = 1;
  public int TucanId;
  private static ArrayList<Tucan> TucanList = new ArrayList<Tucan>();

  public Tucan(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    TucanId = TucanCount++;
    TucanList.add(this);
  }

  public int getTucanId() {
    return TucanId;
  }

  public void removeFromZoo() {
    TucanList.remove(this);
    Bird.getBirdList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public void printTucanist() {
    this.print(TucanList);
  }

  public static ArrayList<Tucan> getTucanList() {
    return TucanList;
  }

  public static void setTucanList(ArrayList<Tucan> tucanList) {
    TucanList = tucanList;
  }

  public static int getListsize() {
    return Tucan.getListSize(TucanList);
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Caaaaaaa");
  }

  @Override
  public void move() {
    String move = String.format("%s the Tucan is trying to fly out of the exhibit but a ZooKeeper stopped him ",
        this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Tucan ");
  }
}
