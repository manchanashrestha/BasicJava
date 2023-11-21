
public class SimpleMathematicalOperations {

	public static void main(String[] args) {
	// Create an obj of class
		SimpleMathematicalOperations mainObj = new SimpleMathematicalOperations();
		
//		Call Methods of this class with the help of the obj.
		mainObj.Add(10,15);
		mainObj.Substraction(4, 3);
		mainObj.Multiplication(2, 5);
		mainObj.Division(10, 2);
	}
		public void Add(int x, int y) 
		{
			int result = x + y;
			System.out.println("Additon of number " +x + " + " +y + " is: "+ result);
		}
		
		public void Substraction(int x, int y) 
		{
			int result = x - y;
			System.out.println("Substraction of number " +x + " - " +y + " is: "+ result);
		}
		public void Multiplication(int x, int y) 
		{
			int result = x * y;
			System.out.println("Multiplication of number " +x + " * " +y + " is: "+ result);
		}
		public void Division(int x, int y) 
		{
			int result = x/y;
			System.out.println("Division of number " +x + "/" +y + " is: "+ result);
		}
	}


