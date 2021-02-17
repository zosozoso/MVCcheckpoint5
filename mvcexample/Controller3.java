package mvcexample;

// Controller 2: displays views 3 and 4
//               (displaying A and B components of the model)
// Offers two button: clear views and refresh views - see below.
// The refresh views button is required as views 3 and 4 do not yet
// subscribe properly to the model and are not notified when it changes.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controller3 extends JFrame implements ActionListener {

    private Model model;
    private View5 view5;
    private JButton switchA; // For direct message to views
    private JButton switchB; // To prompt them to refresh their contents from the model

    // Constructor
    public Controller3(Model model, String title, int y) {

        // Record reference to the model
        this.model = model;

        // Configure the window
        setTitle(title);
        setLocation(40, y);
        setSize(350, 150);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout()); // The default is that JFrame uses BorderLayout

        // Set up input GUI
        switchA = new JButton("Switch A");
        window.add(switchA);
        switchA.addActionListener(this);
        switchB = new JButton("Switch B");
        window.add(switchB);
        switchB.addActionListener(this);
        // Create views
        view5 = new View5(this, model);
        window.add(view5);

        // Display the frame
        setVisible(true);

    } // constructor

    // Button click handling:
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == switchA) {
            view5.setUsingA(true);
        }
        if (e.getSource() == switchB) {
            view5.setUsingA(false);
        }

    } // actionPerformed

} // class Controller2
