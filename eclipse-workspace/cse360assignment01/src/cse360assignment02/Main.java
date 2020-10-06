package cse360assignment02;

public class Main {
	//Even though this was not required I added a main function show that AddingMachine works.
    public static void main(String[] args) {
         AddingMachine myCalculator = new AddingMachine(); 
         myCalculator.add (4); 
         myCalculator.subtract (2); 
         myCalculator.add(5);
         System.out.print(myCalculator.toString());
    }

}
