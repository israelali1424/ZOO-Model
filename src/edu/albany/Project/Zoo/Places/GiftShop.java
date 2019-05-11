package edu.albany.Project.Zoo.Places;

import edu.albany.Project.Zoo.People.Customer;
import edu.albany.Project.Zoo.People.GiftShopWorker;

public class GiftShop {
  private GiftShopWorker worker;
  private String name;
  private Customer buyingCustomer;
  private Items SoldItem;
  private double orderTotal;
  int quanityofSold;
  int id;
  private static int count = 0;

  public enum Items {
    PlatsticSnake(22.0), Candy(7.0), Map(1.00), ZooMug(9.00), KeyChain(3.00);

    private double price;

    private Items(double amount) {
      this.price = amount;
    }

    /**
     * @return the companyName;
     */
    public double getPrice() {
      return price;
    }

  }

  public GiftShop(String name, GiftShopWorker employee) {
    this.name = name;
    this.worker = employee;

  }

  public void ItemSeller(Customer customer, Items items, int quantity) {
    this.setBuyingCustomer(customer);
    this.SoldItem = items;
    this.quanityofSold = quantity;
    id = count++;
  }

  /*
   * public sandwichMaker(Customer customer, sandWhichType sandWhichOrder, int
   * quantity ){ this.orderCustomer = customer; this.sandwhich = sandWhichOrder;
   * this.numberOfSandWhichs = quantity; //this.orderTotal = amountPaid; id =
   * count++;
   * 
   * }
   * 
   * public Customer getOderCustomer() { return orderCustomer; }
   * 
   * public void setOderCustomer(Customer oderCustomer) { this.orderCustomer =
   * oderCustomer; }
   * 
   * public int getNumberOfSandWhichs() { return numberOfSandWhichs; }
   * 
   * public void setNumberOfSandWhichs(int numberOfSandWhichs) {
   * this.numberOfSandWhichs = numberOfSandWhichs; }
   * 
   * public double getOrderTotal() { return orderTotal; }
   * 
   * public void setOrderTotal(double orderTotal) { this.orderTotal = orderTotal;
   * }
   * 
   * 
   * public static int getId() { return id; }
   * 
   * public static void setId(int id) { sandwichMaker.id = id; }
   * 
   * public double getChange( double amountPaid) { double change =
   * this.orderCustomer.getMoneyamount() - this.orderTotal; return change;
   * 
   * }
   */

  public GiftShopWorker getWorker() {
    return worker;
  }

  public void setWorker(GiftShopWorker worker) {
    this.worker = worker;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer getBuyingCustomer() {
    return buyingCustomer;
  }

  public void setBuyingCustomer(Customer buyingCustomer) {
    this.buyingCustomer = buyingCustomer;
  }

  public double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(double orderTotal) {
    this.orderTotal = orderTotal;
  }

  public double getChange(double amountPaid) {
    double change = this.buyingCustomer.getMoneyamount() - this.orderTotal;
    return change;

  }
}
