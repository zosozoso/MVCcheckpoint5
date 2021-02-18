package mvcexample;

// A database with two counter components

import java.util.*;  // For Observable
  //To commit
public class Model extends Observable {

    private int dataBaseA = 0;     // A two component database
    private int dataBaseB = 0;
  
    public Model() { }             // Constructor doesn't do anything
  
    public void modifyA() {        // Mutator method for A component
        
        dataBaseA++;
        setChanged();              // set change setted in observer
        notifyObservers();         // Note: notifies ALL Observing views
        
    }
    public void modifyB() {        // Mutator method for A component

        dataBaseB++;
        setChanged();              // set change setted in observer
        notifyObservers();         // Note: notifies ALL Observing views

    }

    public int getDataA() {
        
        return dataBaseA;
        
    } // getDataA
 
    public int getDataB() {
        
        return dataBaseB;
        
    } // getDataB
  
} // class Model
