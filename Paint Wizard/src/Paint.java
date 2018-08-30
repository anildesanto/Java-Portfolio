import java.text.DecimalFormat;
public class Paint 
{
	private String name;
	private float price;
	private int litres;
	private int coverPerLitre;
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Paint(String name, float price,int litres,int coverPerLitre)
	{
		this.name = name;
		this.price = price;
		this.litres = litres;
		this.coverPerLitre = coverPerLitre;
	}
	public Paint()
	{
		
	}
	public int calculateCover(int litre, int coverPerLitre)
	{
		return	litre * coverPerLitre;
	}
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
	}
	public int getLitres()
	{
		return litres;
	}
	public int getcoverPerLitre()
	{
		return coverPerLitre;
	}
	public String paintDetails()
	{
		return String.format("%s costs £%s and it will cover %dm2 of your room.",name,df.format(price),calculateCover(litres, coverPerLitre));
	}
	public String paintDetails(int roomSize)
	{
		return String.format("%s costs £%s and you will only need %s litres of it to cover your %dm2 large room",name,df.format(price),df.format((float)roomSize/(litres*coverPerLitre)),roomSize)
				+ String.format("\nIt is not recommended since %s litres of paint will go to waste.",(float)roomSize%(litres*coverPerLitre));
	}
	
	
}
