package mvcexample;

// This is the yellow view.
// It displays the A component of the model (data base).
// As supplied, this view does not subscribe to the model as an Observer,
// and relies on its controller to call update to cause the view to be refreshed.

import java.util.*; // For Observer
import java.awt.*;
import javax.swing.*;

public class View5 extends JPanel implements Observer {

    private Model model;
    private Controller3 contr; // Parent Frame
    private boolean usingA;

    private JTextField display;

    // Constructor
    public View5(Controller3 contr, Model model) {

        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;

        // Set up view GUI
        setBackground(Color.yellow);
        add(new JLabel("View5"));
        display = new JTextField("No data", 15);
        add(display);

        // Subscribe to the model
        model.addObserver(this);

    } // constructor

    // Called by controller to refresh the view:
    public void update(Observable o, Object arg) {

        // Fetch (potentially) updated information and display it
        int val = usingA ? model.getDataA() : model.getDataB();
        if (usingA)
            display.setText("Model data A: " + val);
        else
            display.setText("Model data B: " + val);

    } // update

    // Called by the controller to clear the view:
    public void clear() {

        display.setText("");

    } // clear

    public void setUsingA(boolean usingA) {
        if (this.usingA != usingA) {
            this.usingA = usingA;
            update(model, null);
        }
    }

} // class View3
