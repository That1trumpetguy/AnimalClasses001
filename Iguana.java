/**
 * @author Ian Nelson
 * Iguana | Iguana class that extends Animal 
 */
public class Iguana extends Animal{

    /**
     * Iguana | Constructor 
     * @param name | Name for iguana
     */
    Iguana(String name){
        super(name);
    }
   
   /**
    * Overrided play method prints string
    */
   @Override
   public void play(){
   System.out.println("Suns on a hot rock");
   }
      
   /**
    * Overrided sound method prints string
    */
      @Override
   public void sound(){
   System.out.println("Sneezes");
   }
}

