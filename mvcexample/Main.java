package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "controller 1"); // Create first controller
        Controller2 c2 = new Controller2(model, "controller 2"); // Create second controller
        Controller2 c3 = new Controller2(model, "controller 3"); // Create second controller
        Controller2 c4 = new Controller2(model, "controller 4"); // Create second controller
        Controller2 c5 = new Controller2(model, "controller 5"); // Create second controller
        Controller2 c6 = new Controller2(model, "controller 6"); // Create second controller
        Controller2 c7 = new Controller2(model, "controller 7"); // Create second controller
        Controller2 c8 = new Controller2(model, "controller 8 "); // Create second controller
    } // main
  
} // Main
