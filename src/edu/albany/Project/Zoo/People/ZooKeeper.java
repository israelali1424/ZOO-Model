package edu.albany.Project.Zoo.People;

import edu.albany.Project.Zoo.Places.Enclosure;
import edu.albany.Project.Zoo.aniamal.ZooAnimal;

public class ZooKeeper<T extends ZooAnimal> extends ZooWorker {
  private Enclosure enclosure;

  public ZooKeeper(String fname, String lname) {
    super(fname, lname);
    // TODO Auto-generated constructor stub
  }

  public static void main(String args[]) {
    // ZooKeeper Tom = new ZooKeeper("Dave", "Dim");
    // ZooKeeper Dan = new ZooKeeper("Dave", "Dim");
    // System.out.println(Tom.getId());
    // System.out.println(Dan.getId());

  }

  public String feedAnimal(T animal) {
    return String.format("%s  has feed %s for the day", this.toString(), animal.toString());

  }

  @Override
  public String toString() {
    return String.format("%s the ZooKeeper", this.getFirstname());
  }
}
