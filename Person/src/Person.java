import java.util.ArrayList;

public class Person
{
	private String name;
	private int age;
	private String jobTitle;
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public Person(String personName, int personAge, String personJob)
	{
		name = personName;
		age = personAge;
		jobTitle = personJob;	
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getJob()
	{
		return jobTitle;
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s is %d years old and works as a %s ",name, age,jobTitle);
	}
}
