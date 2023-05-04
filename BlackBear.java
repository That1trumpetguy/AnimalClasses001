/**
 * @author Anthony Briones
 * Class that creates a Black Bear object
 */
public class BlackBear extends Animal {

    /**
     * A field which stores the animals name.
     */
    BlackBear(String name){
        super(name);  //CONSTRUCTOR INCORRECT
    }

    /**
     * A constructor that takes in a name.
     * @param name Name of the animal.
     */
    public void Animal(String name){
        this.name = name; //HAD TO ADD VOID
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