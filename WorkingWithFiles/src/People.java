import java.util.ArrayList;;
public class People 
{
	private ArrayList <Person> people = new ArrayList();
	
	public void addToList(Person person)
	{
		people.add(person);
	}
	public void addToList(Person[] list)
	{
		for (Person person : list) 
		{
			people.add(person);
			System.out.println("- " + person.getName() + " added to people list.");
		}
	}
	public void removeFromList(Person[] list)
	{
		for (Person person : list) 
		{
			people.remove(person);
			System.out.println("- " + person.getName() + " removed from people list.");
		}
	}
	public void removeFromList(Person person)
	{
		people.remove(person);
	}
}
