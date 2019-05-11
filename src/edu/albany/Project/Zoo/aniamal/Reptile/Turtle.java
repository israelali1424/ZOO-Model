package edu.albany.Project.Zoo.aniamal.Reptile;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Turtle<T> extends Reptile<T> implements AnimalActions {
  private static int PyCount = 1;
  public int TurtleId;
  private static ArrayList<Turtle> TurtleList = new ArrayList<Turtle>();

  public Turtle(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    TurtleList.add(this);
    TurtleId = PyCount++;
  }

  public void removeFromZoo() {
    TurtleList.remove(this);
    Reptile.getReptileList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getTurtleId() {
    return TurtleId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("GRAAAA");
  }

  // public void printTurtleList() {
  // this.print(TurtleList);
  // }

  @Override
  public void move() {
    String move = String.format("%s the Turtle  swims into the pound", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static ArrayList<Turtle> getTurtleList() {
    return TurtleList;
  }

  public static void setTurtleList(ArrayList<Turtle> TurtleList) {
    TurtleList = TurtleList;
  }

  public static int getListsize() {
    return Turtle.getListSize(TurtleList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Turtle ");

  }

}
