public class String9
{
	public static void main(String[] args) {
		String str="This is Java class For students";
		String[] s=str.split(" ");
		String res="";
		for(String s1:s)
		{
		    if(s1.charAt(0)>='A' && s1.charAt(0)<='Z')
		    {
		        res+=s+" ";
		    }
		}
		System.out.println(res);
	}
}
