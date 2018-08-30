
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter 
{
	public void Buffer()
	{

		BufferedWriter bw = null;
		FileWriter fw = null;

		try 
		{
			String content = "This is the content to write into file\n";
			fw = new FileWriter("C:\\Users\\Profile\\Desktop");
			bw = new BufferedWriter(fw);
			bw.write(content);
			System.out.println("Done");
	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
