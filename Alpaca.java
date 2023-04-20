/**
*Class that extends the animal abstract class to specifically create an alpaca.
*
*@author Geoff Dobson
*/
public class Alpaca extends Animal
{       
   /**
    * A constructor that takes in a name for the alpaca
    *@param Name of the alpaca.
    */
   public Alpaca(String name)
   {
      super(name);
   }
   
   
   /**
    *Method that represents the specific sound
    * an alpaca makes. 
    */
   public void sound()
   {
	   System.out.println("HRMMMMMMMMMMMMMMM");
   }
   
   
   /**
    * Method that represents a specific  activity
    * that an alpaca does for fun.
    */
   public void play()
   {
	   System.out.println("Starts alpacalypse");
   }
}