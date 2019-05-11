package edu.albany.Project.Zoo.Places;

import java.util.ArrayList;

import edu.albany.Project.Zoo.aniamal.ZooAnimal;
import edu.albany.Project.Zoo.aniamal.ZooAnimal.Species;

public class Exhibit<T extends ZooAnimal> {
  // private Class<extends ZooAnimal>Species;
  private int numofAnimals;
  private Species species;

  private ArrayList<?> ExList;

  public Exhibit(ArrayList<?> List, Species aniaml) {

    this.ExList = List;
    this.species = aniaml;
    numofAnimals = ExList.size();
    // this.ExhibitList = List;
    // numofAnimals =

  }

  /*
   * public static void main(String args[]) { Zoo BronxZoo = new Zoo("BronxZoo",
   * "123 Main St"); Exhibit<?> Turtle1 = new Exhibit(Turtle.getTurtleList(),
   * Species.Turtle); // System.out.println(Turtle1.toString()); //
   * Turtle1.setExList(Turtle.getTurtleList()); Turtle Tina = new Turtle("Tina",
   * Gender.Female, AnimalType.Reptile, Species.Turtle, BronxZoo); Turtle Rico =
   * new Turtle("Rico", Gender.Male, AnimalType.Reptile, Species.Turtle,
   * BronxZoo); Turtle1.setNumofAnimals(Turtle.getListsize());
   * System.out.println(Turtle1.getNumofAnimals());
   * 
   * for (Turtle<?> Turtle : (ArrayList<Turtle>) Turtle1.getExList()) { int i = 1;
   * System.out.println(String.format("%d :%s", i, Turtle)); ++i; // String word =
   * String.format("%s is looing at the %s Exhibit and all it has to // offer",
   * this.getFirstname(), // Exhibit.getSpecies()); //
   * System.out.println(String.format("%s is looing at the %s Exhibit and all it
   * // has to offer", this.getFirstname(), // Exhibit.getSpecies())); //
   * System.out.println(Exhibit.toString()); }
   * 
   * 
   * }
   */
  public Exhibit() {

  }

  @Override
  // How to use a class a paramter
  public String toString() {
    return String.format("The  %s Exhbit has %d of %s ", this.getSpecies(), this.getNumofAnimals(), this.getSpecies());
  }

  // Add animal
  // Remove animal
  // Take Tour
  // Play Game

  // public Class<?> getSpecies() {
  // return Species;
  // }
  //
  // public void setSpecies(Class<T> species) {
  // Species = species;
  // }

  public int getNumofAnimals() {
    return numofAnimals;
  }

  public void setNumofAnimals(int numofAnimals) {
    this.numofAnimals = numofAnimals;
  }

  public ArrayList<?> getExList() {
    return ExList;
  }

  public void setExList(ArrayList<?> exList) {
    ExList = exList;
  }

  public Species getSpecies() {
    return species;
  }

  public void setSpecies(Species species) {
    this.species = species;
  }
}
