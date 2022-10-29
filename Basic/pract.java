import java.util.Scanner;

public class pract {

  public class Fan{

    final int slow = 1 ,medium = 2 , fast = 3;

  private int speed;
  private boolean on;
  private double radius;
  String colour;

  Fan()
    {
      speed = slow;
      on = false;
      radius = 5;
      colour = "blue";
    }

  // . Mutators

  public void set_speed(int speed) {
    this.speed = speed;
  }

  public void set_on(boolean on) {
    this.on = on;
  }

  public void set_radius(double radius) {
    this.radius = radius;
  }

  public void set_colour(String colour) {
    this.colour = colour;
  }

  // . Accessors

  public int get_speed() {
    return speed;
  }

  public boolean get_on() {
    return on;
  }

  public double get_radius() {
    return radius;
  }

  public String get_colour() {
    return colour;
  }

  }

  public static void main(String[] args) {

    int a = 5;
    System.out.println(String.format("Value of a is %d", a));

  }

}
