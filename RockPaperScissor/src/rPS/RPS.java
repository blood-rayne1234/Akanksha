package rPS;
import java.util.Random;
import java.util.Scanner;

public class RPS {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("---> 0 for stone : 1 for paper : 2 for scissors <---");
		int x1 = sc.nextInt();
		Random rnd = new Random();
		int x = rnd.nextInt(3);
		
		switch(x1) {
		case 0 : System.out.println("You chose : stone");
				break;
		case 1 : System.out.println("You chose : paper");
				break;
		case 2 : System.out.println("You chose : scissor");
				break;
		default: System.out.println("invalid choice!");	
		}
		//System.out.println("number picked by you!"+x1);
		
		switch(x) {
		case 0 : System.out.println("Computer chose : stone");
				break;
		case 1 : System.out.println("Computer chose : paper");
				break;
		case 2 : System.out.println("Computer chose : scissor");
				break;
		default: System.out.println("invalid choice!");	
		}
		//System.out.println("number picked by computer!"+x);
		
		
		
		if (x==x1) {
			System.out.println("Draw");
		}
		else if((x==0)&&(x1==1)) {
			System.out.println("you won!!");
		}
		else if((x==0)&&(x1==2)) {
			System.out.println("computer won!!");
		}
		else if((x==1)&&(x1==0)) {
			System.out.println("computer won!!");
		}
		else if((x==1)&&(x1==2)) {
			System.out.println("you won!!");
		}
		else if((x==2)&&(x1==0)) {
			System.out.println("you won!!");
		}
		else if((x==2)&&(x1==1)) {
			System.out.println("computer won!!");
		}
	}

}
