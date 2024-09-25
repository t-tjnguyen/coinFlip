package coinFlip;
import java.util.Scanner;
public class CoinFlip
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hi! What is your name?");
				String name = userInput.nextLine();
				
				System.out.println("Hi, " + name + "! How many times do you want to flip a coin?");
				// asks the user how many times he/she wants to flip a coin
				
				int numberOfCoinFlips = userInput.nextInt();
				// assigns the user's input to the variable numberOfCoinFlips
				
				int headsCount = 0;
				int tailsCount = 0;
				// keep track of number of heads/tails
				
				for (int i = 0; i < numberOfCoinFlips; i++)
				// iterates numberOfCoinFlips times
					{
						String headsOrTails = null;
						if ((int) (Math.random() * 2) == 0)
						// result determines whether it is heads or tails
							{
								headsOrTails = "heads";
							}
						else
							{
								headsOrTails = "tails";
							}

						if (headsOrTails == "heads")
							{
								headsCount++;
							}
						else
							{
								tailsCount++;
							}
					}

				if (headsCount == 1 && tailsCount == 1)
					{
						System.out.println("You got " + headsCount + " head and " + tailsCount + " tail.");
					}
				else if (tailsCount == 1)
					{
						System.out.println("You got " + headsCount + " heads and " + tailsCount + " tail.");
					}
				else if (headsCount == 1)
					{
						System.out.println("You got " + headsCount + " head and " + tailsCount + " tails.");
					}
				else
					{
						System.out.println("You got " + headsCount + " heads and " + tailsCount + " tails.");
					}
			}
	}


