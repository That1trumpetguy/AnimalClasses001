/**
 * @author Nathan Miller
 * Goat class that extends Animal class and implements abstract methods
 */
public class Goat extends Animal {
    /**
     * Method to output goat play message
     */
    public void play() {
        System.out.println("The goat frolics in the field");
    }

    /**
     * Method to output goat sound message
     */
    public void sound() {
        System.out.println("The goat lets out a bloodcurdling scream");
    }

    /**
     * Constructor for Goat class with a given Strin
     * @param name String name of the goat
     */
    public Goat(String name) {
        super(name);

    }
}
