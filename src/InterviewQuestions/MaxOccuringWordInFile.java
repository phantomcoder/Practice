package InterviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MaxOccuringWordInFile {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String inputLine = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		try
		{
			while((inputLine = reader.readLine()) != null)
			{
				String[] words = inputLine.split("[\n\t\r.,::!?(){}]");
				
				for(String word : words)
				{
					if(map.get(word.toLowerCase()) == null)
							{
						map.put(word.toLowerCase(), 1);
							}
					else
					{
						int value = map.get(word.toLowerCase()).intValue();
						value++;
						map.put(word.toLowerCase(), value);
					}
				}
			}
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			reader.close();
		}
	}
}
