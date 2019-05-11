package edu.albany.Project.Zoo;

import java.util.ArrayList;

import edu.albany.Project.Zoo.People.ZooWorker;
import edu.albany.Project.Zoo.Places.Enclosure;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;

public class Zoo {
  private String ZooName;
  private String Zoolocation;
  private ArrayList<ZooAnimal> ZooAnimalList;
  private ArrayList<ZooWorker> employeeList;
  private static ArrayList<Enclosure> EnclosureList;
  // private int Animalcout = ZooAnimalList.size();

  // public ArrayList<ZooAnimal> getZooAnimals() {
  // return ZooAnimals.size();
  // }

  public void getZooAnimalList() {
    for (ZooAnimal x : this.ZooAnimalList) {
      System.out.print(x.toString());
    }
  }

  private ZooAnimal Animal;

  public Zoo(String name, String location) {
    this.ZooName = name;
    this.Zoolocation = location;
    this.ZooAnimalList = new ArrayList<ZooAnimal>();
    this.employeeList = new ArrayList<ZooWorker>();
    Zoo.EnclosureList = new ArrayList<Enclosure>();
  }

  public void addAnimal(ZooAnimal Animal) {
    ZooAnimalList.add(Animal);
    System.out.println(Animal.toString() + "has been added to the Zoo");
  }

  public void addemlopyee(ZooWorker worker) {
    this.employeeList.add(worker);
    System.out.println(Animal.toString() + "has been hired to the Zoo");
  }

  public static void addEnclosure(Enclosure enclosure) {
    Zoo.EnclosureList.add(enclosure);
    // System.out.println(Animal.toString() + "has been hired to the Zoo");
  }

  public void removeAnimal(ZooAnimal Animal) {
    int animlalIndex = ZooAnimalList.indexOf(Animal);
    ZooAnimalList.remove(animlalIndex);
    System.out.println(Animal.toString() + "has been removed from the Zoo");
  }

  public void removeemlopyee(ZooAnimal Animal) {
    int animlalIndex = ZooAnimalList.indexOf(Animal);
    ZooAnimalList.remove(animlalIndex);
    System.out.println(Animal.toString() + "has been left their job at the Zoo");
  }

}
