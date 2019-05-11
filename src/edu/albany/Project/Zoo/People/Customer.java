package edu.albany.Project.Zoo.People;

import java.util.ArrayList;
import java.util.HashMap;

import edu.albany.Project.Zoo.Places.Enclosure;
import edu.albany.Project.Zoo.Places.Exhibit;
import edu.albany.Project.Zoo.Places.GiftShop;
import edu.albany.Project.Zoo.Places.GiftShop.Items;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;

public class Customer<T extends ZooAnimal> extends Person {
  private double moneyamount; // The ammout of money a person has
  private HashMap<Items, Double> CurrentItems; // a dictioanry to hold all of the item a person has bought

  public Customer(String fName, String lName, double money) {
    super(fName, lName);
    this.moneyamount = money;
    this.setCurrentItems(new HashMap<Items, Double>());
    System.out.println(this.getFirstname() + " has entered is the Zoo and is ready to Explore");
  }

  public String leaveZoo() {
    return (String.format("%s got bored and left the zoo", this.getFirstname()));
  }

  public void enterGiftShop(GiftShop shop) {
    String word = String.format("\n%s has entered %s and is deciding  whether  or not buy anything \n",
        this.getFirstname(), shop.getName());
    System.out.println(word);
  }

  public void leaveGiftShop() {
    System.out.println(String.format("%s has left the Giftshop", this.getFirstname()));
  }

  /***
   * A person take a Tour an Enclourse and all its Exhibis
   * 
   * @param enclosure
   */

  public void tourEnclouse(Enclosure enclosure) {
    System.out.println(String.format("\n%s  is taking a tour of the %s enclosure full of %ss ", this.getFirstname(),
        enclosure.getName(), enclosure.getAnimalType()));

    for (Exhibit<?> Exhibit : (ArrayList<Exhibit>) enclosure.getExhibits()) {
      // String word = String.format("%s is looing at the %s Exhibit and all it has to
      // offer", this.getFirstname(),
      // Exhibit.getSpecies());
      System.out.println(String.format("%s is looing at the %s Exhibit and all it has to offer", this.getFirstname(),
          Exhibit.getSpecies()));
      System.out.println(Exhibit.getExList());
    }

    System.out.println(String.format("%s has left the %s and wants to see more of the Zoo\n", this.getFirstname(),
        enclosure.getName()));

    // System.out.println("%s is now entering the %s Exibits he looks at all %d %s
    // and then moves on ",
    // this.getFirstname(), Exibit.getSp;

  }

  @Override
  public String toString() {
    return "The Customer's  name is " + super.getFirstname() + "and they have " + this.moneyamount + " amount of money";

  }

  public HashMap<Items, Double> getCurrentItems() {
    return CurrentItems;
  }

  public void setCurrentItems(HashMap<Items, Double> hashMap) {
    CurrentItems = hashMap;
  }

  public void setMoneyamount(double moneyamount) {
    this.moneyamount = moneyamount;
  }

  public double getMoneyamount() {
    return moneyamount;
  }
}
