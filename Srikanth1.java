import java.io.*;
class Srikanth1
{
	public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("abc.txt");
		char[] ch=new char[255];
		fr.read(ch);
		for (char c : ch)
		{
			System.out.println(c);
		}
		fr.close();
		
	}
}
