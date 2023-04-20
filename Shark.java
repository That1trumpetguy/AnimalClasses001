/**
* @author Kameron Barayuga
* A Shark object with animal qualities
*/

public class Shark extends Animal {

   /**
    * Constructor that takes in name and passes it to Animal constructor
    * @param name Name of Shark
    */
   public Shark(String name) {
      super(name);
   }

   /**
    * Method that prints out sound a shark makes
    */
   @Override
   public void sound() {
      System.out.println(this.name + "chomp chomp");
   }

   /**
    * Method that prints out what a shark does
    */
   @Override
   public void play() {
      System.out.println(this.name + "swims maliciously.");
   }

   /**
    * Method that prints out that the shark is eating
    */
   @Override
   public void eat() {
      System.out.println(this.name + "intensely chomps smaller fish.");
   }
   /**
    * main function for java class/
    * @param args
    */
   public static void main(String[] args) {
      Shark shark = new Shark("Kao");
      shark.play();
      shark.sound(); 
      shark.eat();
    }
}