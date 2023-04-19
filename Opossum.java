/**
 * Opossum class extends Animal class.
 * @author Andrian Stepanyuk
 *
 */
public class Opossum extends Animal {
   
   /**
    * A field which stores the opossum's name.
    *
    */
   protected String name;  
   
   /**
    * A constructor that takes in a name.
    * @param name Name of the opossum.
    *
    */
   public Opossum(String name){
      super(name);
   }
   
   /**
    * Method that represents a specific sound
    * an opossum makes.
    *
    */
   @Override
   public void sound() {
      System.out.println("* silence *");
   }
   
   /**
    * Method that represents a specific  activity
    * that an opossum does for fun.
    *
    */
   @Override
   public void play() {
      System.out.println("Frolicking in peoples' yards");
   }
}


