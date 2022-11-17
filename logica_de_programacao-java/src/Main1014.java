import java.util.Locale;
import java.util.Scanner;

public class Main1014 {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
	    double B = input.nextDouble();
		
	    double MEDIA = A/B;
		
		System.out.printf("%.3f km/l%n", MEDIA);
		
		input.close();

	}

}
