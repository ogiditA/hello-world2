
/*
 *Simple basic arithmetic to demonstrate software reuse.
 */
package arithmetic4;

import javax.swing.JOptionPane; // program uses JOptionPane

public class Arithmetic4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // obtain user input from JOptionPane input dialogs
      String firstNumber = 
         JOptionPane.showInputDialog( "Enter first integer" );
      String secondNumber =
          JOptionPane.showInputDialog( "Enter second integer" );

      // convert String inputs to int values for use in a calculation
      int number1 = Integer.parseInt( firstNumber ); 
      int number2 = Integer.parseInt( secondNumber );

      int sum = number1 + number2; // add numbers
      int difference = number1 - number2; // subtract numbers
      int multiplication = number1 * number2; // multiply numbers
      int division = number1 / number2; // divide numbers 

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog( null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
      
      JOptionPane.showMessageDialog( null, "The difference is " + difference, 
         "difference of Two Integers", JOptionPane.PLAIN_MESSAGE );
      
      JOptionPane.showMessageDialog( null, "The multiplication is " + multiplication, 
         "multiplication of Two Integers", JOptionPane.PLAIN_MESSAGE );
      
      JOptionPane.showMessageDialog( null, "The division is " + division, 
         "division of Two Integers", JOptionPane.PLAIN_MESSAGE );
      
      System.exit(0);
    }
    
}