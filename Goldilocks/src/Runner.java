import java.util.concurrent.SynchronousQueue;

public class Runner {

	public static void main(String[] args)
	{
		//create bears 
		Goldilock berry = new Goldilock ("Berry",50,25);
		
		//create porridge 
		Porridge porridge = new Porridge (24);
		Porridge porridge1 = new Porridge (50);
		
		//create chairs that have porridge in front
		Chair chair = new Chair ("chair",false, 100,porridge1);
		Chair chair2 = new Chair ("chair2",false, 50,porridge);
		Chair chair3 = new Chair ("chair3",false, 100,porridge);
		Table table = new Table();
		
		//add to table list
		table.addChair(chair2);
		table.addChair(chair);
		table.addChair(chair3);
		
		//table.tableContents();
		table.whereCanBearEat(berry);
	}

}
