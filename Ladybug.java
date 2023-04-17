/**
*  Ladybug Class
*  Overrides the Animal abstract class
*/
public class Ladybug extends Animal{
   
   /**
   *  Ladybug constructor. Calls the super constructor in the Animal class
   *  Takes a String as argument for the ladybug's name.
   */
   public Ladybug(String name){
         super(name);
   }

   /**
   *  The overridden sound method
   */
   public void sound(){
         System.out.println("Buzz buzz");
   }
   
   /**
   *  The overridden play method
   */
   public void play(){
         System.out.println(this.name + " counts its spots.");
   }
}