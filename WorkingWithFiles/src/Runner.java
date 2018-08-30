

public class Runner
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Matt","Biologist",32);
		Person p2 = new Person("Rich","Trainer",45);
		Person p3 = new Person("Anna","Carer",24);
		Person p4 = new Person("Maria","Teacher",25);
		Person p5 = new Person("Nathan","Psycologist",32);
		//
		People people = new People();
		Person[] peopleList = {p1,p2,p3,p4,p5};
		//
		people.addToList(peopleList);
		
		FileWritter buffer = new FileWritter();
		buffer.Buffer();
	}
}
