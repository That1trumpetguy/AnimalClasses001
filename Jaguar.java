/**
 * @author Brayden Qualman
 * Jaguar class that extends animal
 */
public class Jaguar extends Animal {
    
    /**
    * A constructor that takes in a name.
    *@param Name of the animal 
    */
    public Jaguar(String name) {
        super(name);
    }

    /**
    *Method that makes the roar sound of a jaguar
    */
    @Override
    public void sound() {
        System.out.println("ROAR!");
    }

    /**
    * Method that displays what jaguars like to do with their days
    */
    @Override
    public void play() {
       System.out.println("Finds a nice shaded spot to nap.");
    }
    
}
