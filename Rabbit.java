/**
* Rabbit class that extends the abstract class Animal and implements
* class functionality for a rabbit.
*
* @author Mathew Thiel
*/

class Rabbit extends Animal{
	public Rabbit(String name){
	      super(name);
	}

   /**
   * Prints the sound that the rabbit makes
   **/
   public void sound(){
      System.out.println("pitter-patter");
   }
   
   /**
   * Prints the activity that the rabbit performs.
   **/

   public void play(){
      System.out.println("The rabbit is playing in the field.");
   }
   
   /**
    * Prints the food that the rabbit is eating.
    **/
   public void eat(){
	      System.out.println(this.name + " eats carrots");
   }

}
