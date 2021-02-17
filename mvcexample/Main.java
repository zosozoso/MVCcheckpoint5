package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {

    public static void main(String args[]) {

        Model model = new Model(); // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c21 = new Controller2(model, "Controller2-1", 200); // Create second controller
        Controller2 c22 = new Controller2(model, "Controller2-2", 360); // Create second controller
        Controller2 c23 = new Controller2(model, "Controller2-3", 520); // Create second controller
        Controller3 c3 = new Controller3(model, "Controller3", 680);

    } // main

} // Main
