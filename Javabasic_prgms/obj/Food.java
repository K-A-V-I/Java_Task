package obj;

abstract class Foodie 
{
 String name;
 Foodie(String name) {
     this.name = name;
 }
abstract void prepare();
}

class Burger extends Foodie {
 Burger(String name) {
     super(name);
 }
 void prepare() {
     System.out.println("Preparing a " + name + " burger.");
   }
}

class Pizza extends Foodie {
 Pizza(String name) {
     super(name);
 }
 void prepare() {
     System.out.println("Preparing a " + name + " pizza.");
 }
}

public class Food {
 public static void main(String[] args) 
 {
     Burger bg = new Burger("Cheese");
     bg.prepare();
     Pizza pz = new Pizza("Veg");
     pz.prepare();
 }
}


