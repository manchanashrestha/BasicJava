import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner scnObj = new Scanner(System.in);
		System.out.println("Enter the operator of your type, eg, +, -, / or *");
		String operatorType = scnObj.next();

		BasicCalcFunction objBasicCalcFunction = new BasicCalcFunction();			
		
		if(operatorType.equals("+")) {	
			objBasicCalcFunction.Add();
		} 
		else if(operatorType.equals("-")) {	
			objBasicCalcFunction.Substract();
		} 
		else if(operatorType.equals("/")) {	
			objBasicCalcFunction.Division();
		} 
		else if(operatorType.equals("*")) {		
			objBasicCalcFunction.Multiply();			
		} 
		else {		
			System.out.println("Please, enter valid mathematical operator.");
		} 

	}

}
