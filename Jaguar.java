/**
 * @author Brayden Qualman
 * Jaguar class that extends animal
 */
public class Jaguar extends Animal {

    public Jaguar(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("ROAR!");
    }

    @Override
    public void play() {
       System.out.println("Finds a nice shaded spot to nap.");
    }
    
}
