import java.util.InputMismatchException;
import java.util.Scanner;
public class Scan 
{
	private int age = 0;
	private String name = "";
	private Scanner sc = new Scanner(System.in);
	public void scannerMethod() 
	{
		setName();
		if(setAge(name))
		{
			printDetails();
		}
		else
		{
			setAge(name);
		}
		sc.close();
	}
	public void setName()
	{
		System.out.println("What is your name?");
		name = sc.nextLine();
	}
	public boolean setAge(String name)
	{
		boolean pass = true;
		try
		{
			System.out.println("Hello, " + name + ", nice to meet you.\nhow old are you?");
			age = sc.nextInt();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Lol "+ name + ", that aint a number.");
			pass = false;
		}
		return pass;
	}
	public void printDetails()
	{
		System.out.println(name + " is " + age + " years old");
	}
	
}
