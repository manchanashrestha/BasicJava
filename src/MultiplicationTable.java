
public class MultiplicationTable {

	public static void main(String[] args) {
//		Counting from 50 to 55		
		for (int i = 50; i <= 55; i++) {
			System.out.println(i);
		}
//		Multiplication table from 1 to 15
		int startNum = 1;
		int endNum = 15;
		for (int multipleTable = startNum; multipleTable <= endNum; multipleTable++) {
			System.out.println(
					" ------------------ Multiplication table of " + multipleTable + " is below. ------------------");
			for (int i = 1; i <= 10; i++) {
				int result = i * startNum;
				System.out.println(startNum + " * " + i + " = " + result);
			}
			startNum++;

		}

	}

}
