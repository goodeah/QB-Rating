import java.util.Scanner;
public class football {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double a,b,c,d;
		double ATT,COMP,YDS,TD,INT,PasserRating;
		System.out.println("Enter the player's attempts: ");
		ATT = console.nextDouble();
		
		System.out.println("Enter the player's completions: ");
		COMP = console.nextDouble();
		
		System.out.println("Enter the player's yards: ");
		YDS = console.nextDouble();
		
		System.out.println("Enter the player's touchdowns: ");
		TD = console.nextDouble();
		
		System.out.println("Enter the player's interceptions: ");
		INT = console.nextDouble();
		
		a = ((COMP/ATT)-.3) * 5;
		b = ((YDS/ATT)-3) * .25;
		c = (TD/ATT) * 20;
		d = 2.375 - ((INT/ATT) * 25);
		PasserRating=((a+b+c+d)/6) * 100;
		System.out.println("The player's passer rating is "+ PasserRating);
		System.out.println("The player's completion percentage is " + (COMP/ATT)*100 + "%");
		

	}

}
