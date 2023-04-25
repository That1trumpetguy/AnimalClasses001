/**
*@author Jeffrey Spinner
* A Moose object with moose stuff
*/

public class Moose extends Animal {

  /**
   * Constructor receives a name and passes it to the constructor.
   * @param name the moose's name.
   */
  public Moose(String name) {
    super(name);
  }

  /**
   * This method prints moose music.
   */
  @Override
  public void sound() {
    System.out.println(this.name + " MMMMNNNHHHOUUUGHHH");
  }

  /**
   * This method prints how a moose plays.
   */
  @Override
  public void play() {
    System.out.println(this.name + " frolicks among the meadows");
  }

  /**
   * This method describes a feasting moose.
   */
  @Override
  public void eat() {
    System.out.println(this.name + " munches some grass.");
  }
}