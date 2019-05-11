package edu.albany.Project.Zoo.People;

import edu.albany.Project.Zoo.Places.GiftShop.Items;

public class GiftShopWorker extends ZooWorker {
  public static int ordercount = 1;

  public GiftShopWorker(String fname, String lname) {
    super(fname, lname);
    // TODO Auto-generated constructor stub
  }

  /**
   * Fuction that has a GiftShopShop take an Order form a Customer and lets them
   * buy some item
   */
  public double TakeOrder(Customer customer, Items items, int quantity) {
    this.orderId = ordercount++;

    System.out.println(
        String.format("%s has his order taken by %s from GiftShop ", customer.getFirstname(), this.getFirstname()));
    System.out.println("\n" + "Order Number: " + this.orderId);
    System.out.println("Cashier: " + this.getFirstname() + " ,Cashier id :" + this.getId());
    System.out.println("Customer: " + customer.getFirstname());
    double orderTotal = items.getPrice() * quantity;
    System.out.println("Order Summary:\n" + customer.getFirstname() + "has placed an order for " + quantity + " "
        + items + " sandwhichs");
    System.out.println("For a toal cost of $" + orderTotal + "\n");
    customer.getCurrentItems().put(items, orderTotal);
    return orderTotal;

  }

  // How to share data between fuctions
  /***
   * facade Desgin pattern Uses a infomation form the take order function to
   * create a coustom Receipt for each Customer that buy something from the
   * GiftShop
   */
  public void giveReceipt(Customer customer, double price) {
    double change = customer.getMoneyamount() - price;
    customer.setMoneyamount(change);
    System.out.println("\n" + "Receipt : " + this.orderId);
    // System.out.println("\n"+"Change =";
    System.out.println(
        "Customer: " + customer.getFirstname() + " has recvived their Items" + " and has a total change of " + change);

  }

  @Override
  public String toString() {

    return "The GiftShopWorkers  name is" + super.getFirstname() + "and their id is" + this.getId();

  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public int orderId;
}
