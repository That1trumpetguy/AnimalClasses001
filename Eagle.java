/**
 * Author: Will Johnson
 * Eagle class that extends Animal Class
 *
 *
 */
public class Eagle extends Animal {

    /**
     * Constructor that gives the Eagle a name; references the Animal(super) class
     */

    Eagle(String name) {
        super(name);
    }

    /**
     * Function that prints out what sound an Eagle makes when hunting
     */
    public void sound(){
        System.out.println(this.name + " Fox 3");
    }//end of sound

    /**
     * Function that prints out what an Eagle does to play
     */
    public void play(){
        System.out.println(this.name + "s like to engage in frequent BFM or BVR manueavers for fun, or the occasional" +
                "intercept of a Bear to scare the living daylights out of them. Basic stuff.");
    }//end of play
    /*
        /**
         * Function that prints what an Eagle does to eat
         */
    public void eat(){
        System.out.println(this.name +"s enjoy eating anything from Foxbats, Fulcrums, Bears, or litterally anything it can get a" +
                "missles or guns on. Whenever our politicians let her free, she is ready to go out and eat. ");
    }//end of eat
*/
}//end of main
