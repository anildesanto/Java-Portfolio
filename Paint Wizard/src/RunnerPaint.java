
public class RunnerPaint 
{
	public static void main(String[] args) 
	{
	
		Paint cheapoMax = new Paint("CheapoMax",19.99f,20,10);
		Paint averageJoes = new Paint("AverageJoes",17.99f,15,11);
		Paint duluxourousPaints = new Paint("DuluxourousPaints",25f,10,20);
		PaintShop shop = new PaintShop();
		shop.addPaint(cheapoMax);;
		shop.addPaint(averageJoes);
		shop.addPaint(duluxourousPaints);
		shop.paintsInStore();
		shop.cheapestPaint();
		shop.lessWaste(200);
	}
	
}
