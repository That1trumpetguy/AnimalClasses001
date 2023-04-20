/**
 * @author Jake Robinson
 * KingKobra class extends Animal class and implements abstract method for KingKobra Object
 */
public class KingKobra extends Animal {

    /**
     * Constructor of KingKobra that assigns name from protected value in Animal class 
     * @param name Name of the Animal/KingKobra
     */
    public KingKobra(String name) {

        super(name);
	
    }

    @Override
    /**
     * Prints the sound of a KingKobra
     */
    public void sound() { 

        System.out.println(name +  " Hisssssss");

    }
	
    @Override
    /**
     * Prints what a KingKobra would do for fun
     */
    public void play() {
		
    	System.out.println(name + " finds tall tree to climb");
	
    }
}
