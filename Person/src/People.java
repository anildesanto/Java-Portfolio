import java.util.ArrayList;

public class People
{

	ArrayList<Person> people = new ArrayList<Person>();
	
	public void addToList(Person person)
	{
		people.add(person);
	}
	public void displayWorkers()
	{
		for (Person person : people)
		{
			System.out.println(person.toString());
		}
	}
	public void findPersonByName(String name)
	{
		String textToDisplay = "No data Found about "+ name;
		for (Person person : people) 
		{
			if(person.getName() == name)
				textToDisplay = "Data found\n" + person.toString();
		}
		System.out.println(textToDisplay);
	}
}
