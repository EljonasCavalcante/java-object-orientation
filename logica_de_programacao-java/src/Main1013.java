import java.util.Scanner;

public class Main1013 {

	public static void main(String[] args) {		
	    
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
	    int B = input.nextInt();
		int C = input.nextInt();
		
	    int maiorAb = (A + B + Math.abs(A - B))/ 2; 
	    int maiorNum = (maiorAb + C + Math.abs(maiorAb - C))/ 2;
		
		System.out.printf(maiorNum + " eh o maior");
		
		input.close();

	}

}
