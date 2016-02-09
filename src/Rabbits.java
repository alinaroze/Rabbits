import java.util.Scanner;

public class Rabbits {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many months has it been since the rabbtis started to multiply??");
		int n = input.nextInt();
		
						
		System.out.println("You will have "+multiplyRabbits(n)+" by the end of "+n+" month(s).");

	}

	public static int multiplyRabbits(int n) {

		if (n <= 2)
			return 1;
		else {
			
			int combos = multiplyRabbits(n - 1) + multiplyRabbits(n - 2);
			return combos;
		}

	}
}
