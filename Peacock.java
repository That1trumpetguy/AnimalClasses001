/**
 * @author Wyatt Stohr
 * Peacock class that extends animal
 */
public class Peacock extends Animal{
    /**
     * Method to output Peacock play message
     */
    public void play() {
        System.out.println("The peacock shows its feathers");
    }

    /**
     * Method to output Peacock sound
     */
    public void sound() {
        System.out.println("I'm a peacock and I need to fly");
    }

    /**
     * Constructor for Peacock class with a String
     * @param name String name of the Peacock
     */
    public Peacock(String name) {
        super(name);
    }

    /**
     * main function for java class/
     * @param args
     */
    public static void main(String[] args) {
       Peacock p = new Peacock("Alfred");
       p.play();
       p.sound(); 
       p.eat();
    }
}