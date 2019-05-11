package edu.albany.Project.Zoo;

import edu.albany.Project.Zoo.People.Customer;
import edu.albany.Project.Zoo.People.GiftShopWorker;
import edu.albany.Project.Zoo.People.ZooKeeper;
import edu.albany.Project.Zoo.Places.Enclosure;
import edu.albany.Project.Zoo.Places.Exhibit;
import edu.albany.Project.Zoo.Places.GiftShop;
import edu.albany.Project.Zoo.Places.GiftShop.Items;
import edu.albany.Project.Zoo.aniamal.ZooAnimal.AnimalType;
import edu.albany.Project.Zoo.aniamal.ZooAnimal.Gender;
import edu.albany.Project.Zoo.aniamal.ZooAnimal.Species;
import edu.albany.Project.Zoo.aniamal.Bird.Eagle;
import edu.albany.Project.Zoo.aniamal.Bird.Owl;
import edu.albany.Project.Zoo.aniamal.Bird.Tucan;
import edu.albany.Project.Zoo.aniamal.Fish.BlueTang;
import edu.albany.Project.Zoo.aniamal.Fish.Seahorse;
import edu.albany.Project.Zoo.aniamal.Fish.Shark;
import edu.albany.Project.Zoo.aniamal.Mammal.Bear;
import edu.albany.Project.Zoo.aniamal.Mammal.Lion;
import edu.albany.Project.Zoo.aniamal.Mammal.Tiger;
import edu.albany.Project.Zoo.aniamal.Reptile.Python;
import edu.albany.Project.Zoo.aniamal.Reptile.Turtle;

public class ZooMain {
  public static void main(String args[]) {
    /*** Create of the of The Zoo and it workers **/
    Zoo BronxZoo = new Zoo("BronxZoo", "123 Main St");
    ZooKeeper Tammy = new ZooKeeper("Tammy", "Smith");
    ZooKeeper Cooper = new ZooKeeper("Cooper", "Tan");

    /*** Create of the ReptileEnclousre **/
    Enclosure ReptileEnclosure = new Enclosure("WidlHouse", AnimalType.Reptile, 2, Tammy);
    Exhibit PythonExhbit = new Exhibit(Python.getPythonList(), Species.Python);
    ReptileEnclosure.setExhibit(PythonExhbit);
    Python fig = new Python("RYAN", Gender.Male, AnimalType.Reptile, Species.Python, BronxZoo);
    Python Sam = new Python("Sam", Gender.Male, AnimalType.Reptile, Species.Python, BronxZoo);

    Exhibit TurtleExhbit = new Exhibit(Turtle.getTurtleList(), Species.Turtle);
    ReptileEnclosure.setExhibit(TurtleExhbit);

    Turtle Fred = new Turtle("Fred", Gender.Male, AnimalType.Reptile, Species.Turtle, BronxZoo);
    Turtle Tina = new Turtle("Tina", Gender.Female, AnimalType.Reptile, Species.Turtle, BronxZoo);
    Turtle Cin = new Turtle("Cintha", Gender.Female, AnimalType.Reptile, Species.Turtle, BronxZoo);

    /*** Create of the MammalEnclousre **/
    Enclosure MammalEnclosure = new Enclosure("The Jungle", AnimalType.Mammal, 3, Tammy);
    Exhibit LionExhbit = new Exhibit(Lion.getLionList(), Species.Lion);
    MammalEnclosure.setExhibit(LionExhbit);

    Lion Leo = new Lion("Leo", Gender.Male, AnimalType.Mammal, Species.Lion, BronxZoo);
    Lion Lia = new Lion("Lia", Gender.Female, AnimalType.Mammal, Species.Lion, BronxZoo);
    Lion Asha = new Lion("Asha", Gender.Female, AnimalType.Mammal, Species.Lion, BronxZoo);

    Exhibit TigerExhbit = new Exhibit(Tiger.getTigerList(), Species.Tiger);
    MammalEnclosure.setExhibit(TigerExhbit);
    Tiger Toni = new Tiger("Toni", Gender.Male, AnimalType.Mammal, Species.Tiger, BronxZoo);
    /* use of the move function for fun */
    Toni.move();
    System.out.println();
    Exhibit BearExhbit = new Exhibit(Bear.getBearList(), Species.Bear);
    MammalEnclosure.setExhibit(BearExhbit);

    Bear Papa = new Bear("Papa", Gender.Male, AnimalType.Mammal, Species.Bear, BronxZoo);
    Bear Mama = new Bear("Mama", Gender.Female, AnimalType.Mammal, Species.Bear, BronxZoo);
    Bear Baba = new Bear("Baba", Gender.Male, AnimalType.Mammal, Species.Bear, BronxZoo);
    /*** Create of the BirdEnclousre **/
    Enclosure BirdEnclosure = new Enclosure("Take Flight", AnimalType.Bird, 3, Cooper);

    Exhibit TucanExhbit = new Exhibit(Tucan.getTucanList(), Species.Tucan);
    BirdEnclosure.setExhibit(TucanExhbit);
    Tucan Mann = new Tucan("Mann", Gender.Male, AnimalType.Bird, Species.Tucan, BronxZoo);
    Tucan Camron = new Tucan("Camron", Gender.Male, AnimalType.Bird, Species.Tucan, BronxZoo);
    Tucan Shay = new Tucan("Shay", Gender.Female, AnimalType.Bird, Species.Tucan, BronxZoo);
    Tucan Jazz = new Tucan("Jazz", Gender.Female, AnimalType.Bird, Species.Tucan, BronxZoo);

    Exhibit EagleExhbit = new Exhibit(Eagle.getEagleList(), Species.Eagle);
    BirdEnclosure.setExhibit(EagleExhbit);
    Eagle Sandy = new Eagle("Sandy", Gender.Female, AnimalType.Bird, Species.Eagle, BronxZoo);
    Eagle Tana = new Eagle("Tana", Gender.Female, AnimalType.Bird, Species.Eagle, BronxZoo);
    Eagle Jose = new Eagle("Jose", Gender.Male, AnimalType.Bird, Species.Eagle, BronxZoo);

    Exhibit OwlExhbit = new Exhibit(Owl.getOwlList(), Species.Owl);
    BirdEnclosure.setExhibit(OwlExhbit);
    Owl James = new Owl("James", Gender.Male, AnimalType.Bird, Species.Owl, BronxZoo);

    /*** The Zoo is done being created **/
    System.out.println("The Zoo is done being built now people can Visit");
    Customer Lenny = new Customer("Lenny", "Kent", 43.0);
    Lenny.tourEnclouse(ReptileEnclosure);
    /*** Tammy Feed all of the Lions in the Lion Exhbit **/

    for (Lion lion : Lion.getLionList()) {
      lion.makeNoise();
      System.out.println();
    }
    System.out.println("The Lions start making noise  and " + Tammy.toString() + " has to feed them Now");
    for (Lion lion : Lion.getLionList())
      System.out.println(Tammy.feedAnimal(lion));
    Lenny.tourEnclouse(MammalEnclosure);
    fig.move();
    System.out.println();

    Lenny.tourEnclouse(BirdEnclosure);

    /*** Create of the FishEnclousre **/
    Enclosure FishEnclosure = new Enclosure("Big Ocean", AnimalType.Fish, 2, Cooper);

    Exhibit SharkExhbit = new Exhibit(Shark.getSharkList(), Species.Shark);
    FishEnclosure.setExhibit(SharkExhbit);
    Shark Danny = new Shark("Danny", Gender.Male, AnimalType.Fish, Species.Shark, BronxZoo);
    Shark Sammy = new Shark("Sammy", Gender.Female, AnimalType.Fish, Species.Shark, BronxZoo);

    for (Bear bear : Bear.getBearList()) {
      bear.makeNoise();
      System.out.println();
    }
    System.out.println("The Bear start making noise  and " + Tammy.toString() + " has to feed them Now");
    for (Bear bear : Bear.getBearList())
      System.out.println(Tammy.feedAnimal(bear));
    Lenny.tourEnclouse(MammalEnclosure);

    fig.move();
    System.out.println();

    Exhibit BlueTangExhbit = new Exhibit(BlueTang.getBlueTangList(), Species.BlueTang);
    FishEnclosure.setExhibit(BlueTangExhbit);
    BlueTang Kim = new BlueTang("Kim", Gender.Female, AnimalType.Fish, Species.BlueTang, BronxZoo);
    BlueTang Don = new BlueTang("Don", Gender.Male, AnimalType.Fish, Species.BlueTang, BronxZoo);
    BlueTang Stan = new BlueTang("Stan", Gender.Male, AnimalType.Fish, Species.BlueTang, BronxZoo);
    /***
     * Use of the addNewExhibi to Incease the size of the number of Exhibits in a
     * Enclosure
     **/
    Exhibit SeahorseExhbit = new Exhibit(Seahorse.getSeahorseList(), Species.Seahorse);
    FishEnclosure.addNewExhibit(SeahorseExhbit);
    Seahorse Kingdra = new Seahorse("Kingdra", Gender.Female, AnimalType.Fish, Species.Seahorse, BronxZoo);
    Seahorse Fanta = new Seahorse("Don", Gender.Female, AnimalType.Fish, Species.Seahorse, BronxZoo);
    Seahorse Z = new Seahorse("Z", Gender.Male, AnimalType.Fish, Species.Seahorse, BronxZoo);
    /*** Lenny Buys something from the GiftShop **/
    GiftShopWorker Tony = new GiftShopWorker("Tony", "Snail");
    GiftShop Guard = new GiftShop("The Lion's Den Giftshop", Tony);
    Lenny.enterGiftShop(Guard);
    // Call the Take order functio in the give Receipt fuction
    Tony.giveReceipt(Lenny, Tony.TakeOrder(Lenny, Items.Candy, 2));
    Lenny.leaveGiftShop();

    Sandy.move();
    System.out.println();

    Lenny.tourEnclouse(FishEnclosure);
    System.out.println("\n" + Lenny.leaveZoo());

    //

    // System.out.println(fig.getAnimalGender());
    // System.out.println(fig.getAnimalType());

    // Zoo BkZoo = new Zoo("Brookyln", "BK NY");

    // for (Object python : PythonExhbit.getExList())
    // System.out.println(python.toString());

    // System.out.println(Python.getPythonList());
    // Lion Tia = new Lion("Tia", Gender.Female, AnimalType.Mammal, BronxZoo);
    // Lion Don = new Lion("Don", Gender.Female, AnimalType.Mammal, BronxZoo);
    // Python Tio = new Python("Tio", Gender.Female, AnimalType.Mammal, BronxZoo);

    // Mammal.PrintMammalList();
    // BkZoo.getZooAnimalList();
    // BronxZoo.getZooAnimalList();
    /*
     * System.out.println(fig.getReptileId()); Shark Don = new Shark();
     * System.out.println(Don.getZooAnimalCount());
     * 
     * Lion Tom = new Lion(); System.out.println(Tom.getZooAnimalCount());
     * 
     * Python Dan = new Python(); System.out.println(Dan.getReptileId());
     * System.out.println(Dan.getZooAnimalCount());
     */

  }
}
