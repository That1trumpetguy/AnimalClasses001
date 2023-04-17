/**
 * @author Spencer Hooper
 * Duck class that extends Animal class.
 */
public class Duck extends Animal{

   /**
    * Constructor that passes name to constructor in Animal.
    * @param String name Duck
    */
    
    public Duck(String name){
      super(name);
    }
    
    /**
     * Method that displays the sound a duck would make.
     * 
     */
     @Override
     public void sound(){
        System.out.println(this.name + ": " + " Quack Quack");
     }
     
     /**
      * Method that prints a duck playing
      *
      */
      @Override
      public void play(){
         System.out.println(this.name + ": " + " Splashing in lake.");
      }
      
      /**
       * Method that prints what the duck is eating
       *
       */
       @Override
       public void eat(){
          System.out.println(this.name + ": " + " is eating a fresh water minnow.");
       }
}    
   