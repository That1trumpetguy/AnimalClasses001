/**
 * Alligator class extends Animal class.
 * @author Steiner Christensen
 *
 */
public class Alligator extends Animal {
   
   
   /**
    * Name of aligator
    *
    */
   protected String name = "Jeff";  
   
   /**
    * constructer
    * @param name Name of the alligator.
    *
    */
   public Alligator(String name){
      super(name);
   }
   
   /**
    * prints the sound the alligator makes
    *
    */
   @Override
   public void sound() {
	   
      System.out.println("VROOM VROOM");
   }
   
   /**
    * Call this method to print what the alligator does for fun.
    *
    */
	
   @Override
   public void play() {
	   
      System.out.println("Gobbles up a small child who walked near the water");
	  
   }
}


