import java.util.*;
/**
Goldfish class that inherits properties from animal class
*@author Lucas Martin.
*/
public class Goldfish extends Animal{

     
  /**
   * A constructor that takes in a name.
   *@param name Name of the animal.
   */
   public Goldfish(String name) {
      super(name);
   }
  
  /**
  * Displays the sound a goldfish makes
   */
   public void sound(){
      System.out.println("Blub Blub");
   }
   /**
  * Displays what a goldfish does for fun
   */
   public void play(){
      System.out.println("Swims in circles wooo this is so fun we love swimming");
   }
}