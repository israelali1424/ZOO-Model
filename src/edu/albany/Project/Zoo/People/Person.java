package edu.albany.Project.Zoo.People;

public abstract class Person {
  private String firstname;
  private String lastname;

  public Person(String fname, String lname) {
    this.firstname = fname;
    this.lastname = lname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

}
