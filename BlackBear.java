/**
 * @author Anthony Briones
 * Class that creates a Black Bear object
 */
public class BlackBear extends Animal {

    /**
     * A field which stores the animals name.
     */
    protected String name;

    /**
     * A constructor that takes in a name.
     * @param name Name of the animal.
     */
    public Animal(String name){
        this.name = name;
    }

    /**
     * Method that represents the black bear's sound
     */
    public void sound() {
        System.out.println("'Rrrrrmmph...'");
    }

    /**
     * An activity that black bears do for fun
     */
    public void play() {
        System.out.println(this.name + " is scratching their back on a tree!");
    }
    /**
     * A  method that prints out that the animal is eating food.
     */
    public void eat(){

        System.out.println(this.name + " is eating some honey.");
    }
}