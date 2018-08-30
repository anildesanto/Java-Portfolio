import java.util.ArrayList;

public class PaintShop 
{
	private ArrayList<Paint> shop = new ArrayList<Paint>();
	public void addPaint (Paint paintType)
	{
		System.out.println(paintType.getName() + " paint added to shop");
		shop.add(paintType);
	}
	public void removePaint (Paint paintType)
	{
		System.out.println(paintType.getName() + " paint removed from shop");
		shop.remove(paintType);
	}
	
	public void paintsInStore()
	{
		System.out.println("--------------------------------");
		System.out.println("Paints available in store:");
		for (Paint paint : shop)
		{
			System.out.println(paint.paintDetails());
		}
	}
	public void  lessWaste(int roomSize)
	{
		Paint moreWastePaint = null;
		for (int i = 0; i < shop.size(); i++) 
		{
			if(moreWastePaint == null)
			{
				moreWastePaint = shop.get(i);
			}
			else
			{
				float waste = roomSize%shop.get(i).calculateCover(shop.get(i).getLitres(),shop.get(i).getcoverPerLitre());
				float moreWaste = roomSize%moreWastePaint.calculateCover(moreWastePaint.getLitres(),moreWastePaint.getcoverPerLitre());
				if(waste > moreWaste)
				{
					moreWastePaint = shop.get(i);
				}
			}
		}
		String moreWaste = String.format("The paint that wastes more is: \n%s",moreWastePaint.paintDetails(roomSize));
		System.out.println(moreWaste);
	}
	public void cheapestPaint()
	{
		System.out.println("--------------------------------");
		Paint cheapestPaint = null;
		for (int i = 0; i < shop.size(); i++) 
		{
			if(cheapestPaint == null)
			{
				cheapestPaint = shop.get(i);
			}
			else
			{
				if(shop.get(i).getPrice() < cheapestPaint.getPrice() &&
						shop.get(i).calculateCover(shop.get(i).getLitres(),shop.get(i).getcoverPerLitre()) 
						> cheapestPaint.calculateCover(cheapestPaint.getLitres(), cheapestPaint.getcoverPerLitre()))
				{
					cheapestPaint = shop.get(i);
				}
			}
		}
		String cheapest = String.format("The cheapest paint is: \n%s",cheapestPaint.paintDetails());
		System.out.println(cheapest);
	}
}
