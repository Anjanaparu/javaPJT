package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodepgm {
	String link= ("https://www.facebook.com/login/");
	@Test
	public void responseCodefb()
	{
		try
		{ 
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			if (code==200)
			{
			System.out.println("Succesful link");
			}
			else {
				System.out.println("Not succesful link");
			}
			}
		catch(Exception e)
		{
		}
	}
}
	
	


