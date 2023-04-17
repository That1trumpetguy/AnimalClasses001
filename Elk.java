/**
 * A child class "Elk" extends Animal
 * Overrides abstract methods
 * @author Angel
 */
public class Elk extends Animal {
	
	/**
	 * A constructor for Elk
	 * @param name Name of Elk
	 */
	public Elk(String name) {
		super(name);
	}

	/**
	 * A method to output an Elk's noise
	 * Overrides abstract method 
	 */
	public void sound() {
		// Higher pitch horse neigh
		System.out.println("Elk Bugles.");	
	}

	/**
	 * A method to output how an Elk plays
	 * Overrides abstract method
	 */
	public void play() {
		System.out.println("Elk prances in puddles.");
	}

}
