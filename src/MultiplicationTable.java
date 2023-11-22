
public class MultiplicationTable {

	public static void main(String[] args) {
//		Counting from 50 to 55		
		for(int i = 50; i<= 55; i++)
		{
			System.out.println(i);
		}
//		Multiplication table
		int n = 1;
		for(int multipleTable = 1; multipleTable <= 15;multipleTable++ )
		{
			System.out.println(" ------------------ Multiplication table of " + multipleTable + " is below. ------------------");
			for(int i = 1; i<=10; i++) 
			{			
				int result = i * n;
				System.out.println(n + " * " + i + " = " + result);
			}
			n++;
			
		}

	}

}
