package cse360assignment02;

public class AddingMachine {

private int total;
private String history;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = Integer.toString(total);
  }
  
  //The getTotal method returns the current total.
  public int getTotal () {
    return total;
  }
  
  
 //The add method adds the parameter to the total variable.
  public void add (int value) {
	  history += " + " + Integer.toString(value);		//Add change to history.
	  total = value + total;							//Calculate new total
  }

  //The subtract method subtracts the parameter from the total variable
  public void subtract (int value) {
	  history += " - " + Integer.toString(value);		//Add change to history.
	  total = total - value;							//Calculate new total.
  }

  //This method returns the history
  public String toString () {
	  return history;
  }

  //This method clears the history.
  public void clear() {
	  history = "";
  }
}



