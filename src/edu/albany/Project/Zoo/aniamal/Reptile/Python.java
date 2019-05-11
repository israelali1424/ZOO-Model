package edu.albany.Project.Zoo.aniamal.Reptile;

import java.util.ArrayList;

import edu.albany.Project.Zoo.AnimalActions;
import edu.albany.Project.Zoo.Zoo;

public class Python<T> extends Reptile<T> implements AnimalActions {
  private static int PyCount = 1;
  public int PythonId;
  private static ArrayList<Python> PythonList = new ArrayList<Python>();

  public Python(String name, Gender animalGender, AnimalType animalType, Species animal, Zoo zoo) {
    super(name, animalGender, animalType, animal, zoo);
    PythonList.add(this);
    PythonId = PyCount++;
  }

  public void removeFromZoo() {
    PythonList.remove(this);
    Reptile.getReptileList().remove(this);
    System.out.print(this.toString() + "has passed away and has been removed from the zoo");

  }

  public int getPythonId() {
    return PythonId;
  }

  @Override
  public void makeNoise() {

    // TODO Auto-generated method stub
    System.out.println("Hiss");
  }

  // public void printPythonList() {
  // this.print(PythonList);
  // }

  @Override
  public void move() {
    String move = String.format("%s the Python  has slithered up a Tree ", this.getAnimalName());
    // TODO Auto-generated method stub
    System.out.println(move);
  }

  public static ArrayList<Python> getPythonList() {
    return PythonList;
  }

  public static void setPythonList(ArrayList<Python> pythonList) {
    PythonList = pythonList;
  }

  public static int getListsize() {
    return Python.getListSize(PythonList);
  }

  @Override
  public String toString() {
    return (this.getAnimalName() + " the Python ");

  }

}
