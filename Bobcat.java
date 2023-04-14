/**
 * @author Kellen Hausmann
 * A Bobcat class that extends Animal class
 */
public class Bobcat extends Animal
{
    /**
     * Constructor of class Bobcat 
     * @param name Name of the bobcat
     */
    Bobcat(String name)
    {
        super(name);
    }
    /**
     * Method that prints out a sound of a bobcat
     */
    @Override
    public void sound()
    {
        System.out.println("Uhhh meow");
    }
    /**
     * A method that prints out what a bobcat does
     */
    @Override
    public void play()
    {
        System.out.println("Does a backflip and climbs a tree");
    }
}

