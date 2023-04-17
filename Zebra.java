
/**
 * 
 * @author Bobi Vladimirov
 * Class Zebra inherits Animal
 */
public class Zebra extends Animal{
/**
 * Constructor extending Animal
 * @param name String for the name of the Zebra
 */
	public Zebra(String name) {
		super (name);
	}
/**
 * Show what sound does the zebra make;	
 */
	
	@Override
	public void sound () {
		System.out.println("ZZZZZZZZZ");
	}
/**
 * Method showing how does the zebra like to play.	.
 */
	
	@Override
	public void play () {
		System.out.println("Run away from Lions");
	}
	
/**
 * Method showing what does the zebra eat
 */
	@Override
	public void eat () {
		System.out.println("I eat grass");
	}
	
	
}
