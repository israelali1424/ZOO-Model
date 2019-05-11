package edu.albany.Project.Zoo.People;

public abstract class ZooWorker extends Person {
  private static int count = 1;
  int id;

  public ZooWorker(String fname, String lname) {
    super(fname, lname);
    id = count++;
    // TODO Auto-generated constructor stub
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {

    return (this.getFirstname() + "works at the Zoo");
  }
}
