import java.util.ArrayList;

public class Manager 
{
	public static void main(String[] args) 
	{
		String personName = "Richard";
		People people = new People();
		Person ruth = new Person("Ruth",24,"Barist");
		Person jonh = new Person("John",30,"Teacher");
		people.addToList(ruth);
		people.addToList(jonh);
		//people.displayWorkers();
		
		people.findPersonByName(personName);
	}
}
