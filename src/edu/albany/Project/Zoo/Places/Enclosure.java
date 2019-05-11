package edu.albany.Project.Zoo.Places;

import java.util.ArrayList;

import edu.albany.Project.Zoo.Zoo;
import edu.albany.Project.Zoo.People.Customer;
import edu.albany.Project.Zoo.People.ZooKeeper;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;
import edu.albany.Project.Zoo.aniamal.ZooAnimal.AnimalType;

public class Enclosure<T extends ZooAnimal> {
  private String Name;
  private static final Exhibit Exhibit = null;
  private int numberofExhibits;
  private ZooKeeper zooKeeper;
  private AnimalType animalType;
  private Class<T> Group;
  public ArrayList<Exhibit> Exhibits;

  public Enclosure(String name, AnimalType Type, int numExhbits, ZooKeeper overWatcher) {
    this.Name = name;
    this.animalType = Type;
    this.numberofExhibits = numExhbits;
    this.zooKeeper = overWatcher;

    Exhibits = new ArrayList<Exhibit>();
    for (int i = 0; i < numberofExhibits; i++) {
      this.createExhibit(this);
    }
    System.out.println(String.format("\nThe %s Enclosure has been built and has %d Exhibits", this.getAnimalType(),
        this.getNumberofExhibits()));
    // Add the Enclosure being made too the Zoo list of Enclosure
    Zoo.addEnclosure(this);

  }

  public int getNumberofExhibits() {
    return numberofExhibits;
  }

  public void setNumberofExhibits(int numberofExhibits) {
    this.numberofExhibits = numberofExhibits;
  }

  public ZooKeeper getZooKeeper() {
    return zooKeeper;
  }

  public void setZooKeeper(ZooKeeper zooKeeper) {
    this.zooKeeper = zooKeeper;
  }

  public AnimalType getAnimalType() {
    return animalType;
  }

  public void setAnimalType(AnimalType animalType) {
    this.animalType = animalType;
  }

  public ArrayList<Exhibit> getExhibits() {
    return Exhibits;
  }

  public void setExhibits(ArrayList<Exhibit> exhibits) {
    Exhibits = exhibits;
  }

  // Create an empty Exbit before is set when a Enclsure is created
  public void createExhibit(Enclosure Enclosure) {
    Exhibit newExhibit = new Exhibit();
    this.Exhibits.add(newExhibit);
  }

  // When palces the value of an exhit in an Enclousre if there still space
  public void setExhibit(Exhibit newExhibit) {
    for (Exhibit exhibit : Exhibits)
      if (exhibit.getSpecies() == null) {
        int exhibitIndex = this.Exhibits.indexOf(exhibit);
        Exhibits.set(exhibitIndex, newExhibit);
        System.out.println(String.format("\nThe %s  exhibit has been created in the  %s Enclosure",
            newExhibit.getSpecies(), this.getAnimalType()));
        break;

      }
  }

  // Create an new Exhibit in the Enclouse and make the list size plus one
  public void addNewExhibit(Exhibit newExhibit) {
    this.Exhibits.add(newExhibit);
    this.numberofExhibits++;
    System.out.println(String.format("\nThe %s Exhibit is newly built and  has been added to the %s Enclosure of %ss",
        newExhibit.getSpecies(), this.getName(), this.getAnimalType()));
  }

  public void removeNewExhibit(Exhibit newExhibit) {
    this.Exhibits.remove(newExhibit);
    this.numberofExhibits--;
    System.out.println(
        String.format("The %s has been removed to the %s Enclosure", newExhibit.getClass(), this.getAnimalType()));
  }

  public void ExploreExlourse(Customer Person) {

  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    this.Name = name;
  }

}
