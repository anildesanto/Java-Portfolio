
public class Person 
{
	private String name;
	private String occupation;
	private int age;
	
	public Person( String name,String occupation,int age)
	{
		this.name = name;
		this.occupation = occupation;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public String getOccupation()
	{
		return occupation;
	}
	public int getAge()
	{
		return age;
	}
	public String personDetails()
	{
		return String.format("Name: %s\nOccupation: %s\nAge: %s",name,occupation,age);
	}
}
