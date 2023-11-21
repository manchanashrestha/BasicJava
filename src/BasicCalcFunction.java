import java.util.Scanner;

public class BasicCalcFunction {
	
	public void Add() {
	
	Scanner scnObj = new Scanner(System.in);
	
	System.out.println("Input first number to add");
	int firstNum = scnObj.nextInt();
	
	System.out.println("Input second number to add");
	int secondNum = scnObj.nextInt();
	
	int result = firstNum + secondNum;
	System.out.println("Additon of two numbers is: "+ result);
	}
	
	public void Substract() {
		
	Scanner scnObj = new Scanner(System.in);
	
	System.out.println("Input first number to Substract");
	int firstNum = scnObj.nextInt();
	
	System.out.println("Input second number to Substract");
	int secondNum = scnObj.nextInt();
	
	int result = firstNum - secondNum;
	System.out.println("Substraction of two numbers is: "+ result);
	}
	
	public void Multiply() {
		
	Scanner scnObj = new Scanner(System.in);
	
	System.out.println("Input first number to Multiply");
	int firstNum = scnObj.nextInt();
	
	System.out.println("Input second number to Multiply");
	int secondNum = scnObj.nextInt();
	
	int result = firstNum * secondNum;
	System.out.println("Multiplication of two numbers is: "+ result);
	}
	
	public void Division() {
		
	Scanner scnObj = new Scanner(System.in);
	
	System.out.println("Input newumerator number to Divide");
	int firstNum = scnObj.nextInt();
	
	System.out.println("Input denomenator number to Divide");
	int secondNum = scnObj.nextInt();
	
	int result = firstNum / secondNum;
	System.out.println("Division of two numbers is: "+ result);
	}

}
