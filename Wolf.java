/**
 * Wolf class that extends Animal class.
 * @author Michael Barry
 */
public class Wolf extends Animal{
    /**
     * Constructor of Wolf Class.
     * @param name Name of the Wolf.
     */
    Wolf (String name){
        super(name);
    }
    /**
     * Method that prints the sound that the Wolf makes.
     */
    @Override
    public void sound(){
        System.out.println("GRRRRRRR!");
    }

    /**
     * Method that prints the activity the Wolf is pursuing.
     */
    @Override
    public void play(){
        System.out.println("Blows piggy's houses down.");
    }

    /**
     * Method that prints what the Wolf eats.
     */
    @Override
    public void eat(){
        System.out.println("I eat piggies.");
    }
}
