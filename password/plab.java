
import java.util.Scanner; 
public class plab{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String password = "e";
		String guess = "";
		while(!guess.equals(password)){
			System.out.println("Guess the password");
			guess = sc.nextLine();
		}
		System.out.print("Password Cracked :)");
	
	}
}

