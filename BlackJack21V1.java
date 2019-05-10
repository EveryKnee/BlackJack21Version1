package glove_world1;

import java.util.*;

public class BlackJack21V1 {
	
//	
//	public static int AddComputerNum(int x,int y) {
//		int result = x+y;
//		return result;
//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int humanCard1 = getNumber();
		int humanCard2 = getNumber();
		int compCard1 = getNumber();
		int compCard2 = getNumber();
		
		int humanSum = AddNum(humanCard1,humanCard2);
		int compSum = AddNum(compCard1,compCard2);
		int humanDif = SubtractNum(21,humanSum);
		int compDif = SubtractNum(21,compSum);
		
		System.out.println("Human Card One: " + humanCard1);
		System.out.println("Human Card Two: " + humanCard2);
		System.out.println(humanSum);
		while (humanSum < 21) {
			Scanner input = new Scanner(System.in);
			System.out.println("Hey human.  Would you like to pick another card?");
			String anotherCard = input.nextLine();
		} else {
			System.out.println("Good job human.  You win!");
		}
		boolean anotherCard = true;
		
		System.out.println("Computer Card One: " + compCard1);
		System.out.println("Computer Card Two: " + compCard2);
		System.out.println(compSum);
		
//		System.out.println(AddNum(compCard1,compCard2));
		
		System.out.println("The humanSum minus 21 is: " + humanDif);
		System.out.println("The computerSum minus 21 is: " + compDif);
		System.out.println(ThisIsWhereItGetsFun(humanDif,compDif));
		System.out.println(AnotherCard());
			
	}

	public static int getNumber() {
		Random rand = new Random();
		int humanNumber1 = rand.nextInt(9) + 2;
		return humanNumber1;
	}
	public static int AddNum(int x,int y) {
		int result = x + y;
		return result;
		}
	public static int SubtractNum(int x,int y) {
		int result = x - y;
		return result;
		}
	
	public static String ThisIsWhereItGetsFun(int x, int y) {
		if (x < y) {
			 String winner = "Congrats human. You win!!";
			 return winner;
		}else {
			 String winner = "Sorry human. Computer wins :(";
			 return winner;
		}
	}
	public static String AnotherCard() {
			Scanner input = new Scanner(System.in);
			System.out.println("Hey human.  Would you like to pick another card?");
			String anotherCard = input.nextLine();
			return anotherCard;
		}
	
}
