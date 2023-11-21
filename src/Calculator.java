import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator objCalculator = new Calculator();
		objCalculator.calculation();
		
	}
	
	public void calculation()
	{
		Scanner scnObj = new Scanner(System.in);
		System.out.println("Enter the operator of your type, eg, +, -, / or *");
		String operatorType = scnObj.next();
		
		
		
		if(operatorType.equals("+")) {	
			System.out.println("Enter first nuumber");
			String firstNumber = scnObj.next();
			System.out.println("Enter second nuumber");
			String secondNumber = scnObj.next();
			
			Integer firstInteger = Integer.parseInt(firstNumber);
			Integer secondInteger = Integer.parseInt(secondNumber);
			
			System.out.println(" Addition of two number  " + firstNumber +" and "+ secondNumber +" is "+  (firstInteger + secondInteger));
		} 
		else if(operatorType.equals("-")) {	
			System.out.println("Enter first nuumber");
			String firstNumber = scnObj.next();
			System.out.println("Enter second nuumber");
			String secondNumber = scnObj.next();
			
			Integer firstInteger = Integer.parseInt(firstNumber);
			Integer secondInteger = Integer.parseInt(secondNumber);
			
			if(firstInteger > secondInteger) {
				System.out.println(" Subtraction of two number  " + firstNumber +" and "+ secondNumber +" is "+  (firstInteger - secondInteger));
			} else {
				System.out.println("First number should be greater than second number");
			}
		} 
		else if(operatorType.equals("/")) {	
			System.out.println("Enter first nuumber");
			String firstNumber = scnObj.next();
			System.out.println("Enter second nuumber");
			String secondNumber = scnObj.next();
			
			Integer firstInteger = Integer.parseInt(firstNumber);
			Integer secondInteger = Integer.parseInt(secondNumber);
			
			if(firstInteger > secondInteger) {
				
				System.out.println(" Division of two number  " + firstNumber +" and "+ secondNumber +" is "+  (firstInteger/secondInteger));
			} else {
				System.out.println("First number should be greater than second number");
			}
		} 
		else if(operatorType.equals("*")) {		
			System.out.println("Enter first nuumber");
			String firstNumber = scnObj.next();
			System.out.println("Enter second nuumber");
			String secondNumber = scnObj.next();
			
			Integer firstInteger = Integer.parseInt(firstNumber);
			Integer secondInteger = Integer.parseInt(secondNumber);
			System.out.println(" Multiplication of two number  " + firstNumber +" and "+ secondNumber +" is "+  (firstInteger * secondInteger));
		} 
		else {		
			System.out.println("Please, enter valid mathematical operator.");
		} 
		
	}
	
	

}
