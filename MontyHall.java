import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ben Nguyen
 * Monty Hall Project
 */
public class MontyHall
{
	public static void main(String[] args)
	{
Random rand= new Random();
Scanner m0nty= new Scanner(System.in);
int car= rand.nextInt(3)+1;
System.out.println("What door is the car behind? ");
int choice= m0nty.nextInt();
int choice2= 1;
if (choice>=1 && choice<=3)
		{
if(choice==car)
{
if (car==1)
{
			System.out.println("Door 2 has a goat! ");
			int goat= 2;
			choice2=3;
}
			else if (car==2)
{
			System.out.println("Door 3 has a goat! ");
			int goat=3;
			choice2=1;
}
			else if (car==3)
{
			System.out.println("Door 1 has a goat! ");
			int goat=1;
			choice2=2;
}
}
			else
{
			if (car==1 && choice==2)
{
				System.out.println("Door 3 has a goat! ");
				int goat=3;
				choice2=1;
}
				else if (car==2 && choice==3)
{
				System.out.println("Door 1 has a goat! ");
				int goat=1;
				choice2=2;
}
				else if (car==3 && choice==1)
{
				System.out.println("Door 2 has a goat! ");
				int goat= 2;
					choice2= 3;
}
				else if (car==1 && choice==3)
{
				System.out.println("Door 2 has a goat! ");
				int goat= 2;
				choice2=1;
}
				else if (car==2 && choice==1)
{
				System.out.println("Door 3 has a goat! ");
				int goat=3;
				choice2=2;
}
				else if (car==3 && choice==2)
				{
				System.out.println("Door 1 has a goat! ");
				int goat=1;
				choice2=3;
				}
}
				System.out.println("Do you want to change doors?");
				String user= m0nty.next();
				user=user.toLowerCase();
				if (user.equals("yes")){
				if (choice2==car)			
{
				System.out.println("The car was behind door "+ car);
				System.out.println("YOU WON!");
}
				else
{
				System.out.println("The car was behind door "+ car);
				System.out.println("YOU LOST!");
}
}
				if (user.equals("no"))
{
				if (choice==car)
{
				System.out.println("The car was behind door "+ car);
				System.out.println("YOU WON!");
}
				else
{
				System.out.println("The car was behind door "+ car);
				System.out.println("YOU LOST!");
				}
			}
		}
	}
}