
public class Doggo 
{
	public void doggoCompetition(int number, int limit)
	{
		int[] ndList = {2,22,32,42,52,62,72,82,92};
		int[] rdList = {3,23,33,43,53,63,73,83,93};
		int[] stList = {1,21,31,41,51,61,71,81,91};
		for (int i = 1; i <= limit; i++) 
		{
			String listName = "th";
			for (int num : ndList) 
			{
				if(i == num)
				{
					listName = "nd";
				}
			}
			for (int num : rdList) 
			{
				if(i == num)
				{
					listName = "rd";
				}
			}
			for (int num : stList) 
			{
				if(i == num)
				{
					listName = "st";
				}
			}
			if(i != number)
			{
				System.out.println(append(i,listName));
			}
		}
	}
	public String append(int number, String end)
	{
		return number + end;
	}
}
