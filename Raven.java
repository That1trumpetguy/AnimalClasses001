/**
*@author Justin Storms
*Class which creates a Raven object with associated animal qualities.
*/
public class Raven extends Animal{
   
   
   /**
    * A field which stores the animals name.
    */
   protected String name;
      
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the animal.
    */
   public Animal(String name){
      this.name = name;
   }
   
   
   /**
    *Abstract method that should represent a specific sound
    * an animal makes. 
    */
   public void sound(){
      System.out.println("Nevermore.");
   }
   
   
   /**
    * Abstract method that should represent a specific  activity
    * that an animal does for fun.
    */
   public abstract void play(){
      System.out.println("Stares vacantly");
   }
   
   
   /**
    * A  method that prints out that the animal is eating food.
    */
   public void eat(){
      System.out.println(this.name + " eats some food.");
   }  
}


