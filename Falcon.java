/**
*@author Huong Mai
* A Falcon object with associated animal qualities.
*/

public class Falcon extends Animal {

  /**
   * Constructor that takes in a name and passes it to the Animal constructor.
   * @param name Name of the falcon.
   */
  public Falcon(String name) {
    super(name);
  }

  /**
   * Method that prints out the specific sound a falcon makes.
   */
  @Override
  public void sound() {
    System.out.println(this.name + " kak-kak-kak");
  }

  /**
   * Method that prints out a specific activity that a falcon does for fun.
   */
  @Override
  public void play() {
    System.out.println(this.name + " hunt for small animals.");
  }

  /**
   * Method that prints out that the falcon is eating food.
   */
  @Override
  public void eat() {
    System.out.println(this.name + " tears into its prey with sharp talons and beak.");
  }
}