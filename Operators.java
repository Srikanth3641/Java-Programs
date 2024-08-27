//import java.util.Scanner;
class Operators 
//Bitwise operatots( &,|,^,~) And,or,xor,not
//Shifts (>>,<<) right , left
//Arithemetic operators
//Unary operators (post increment,pre increment)
{
	public static void main(String[] args) 
	{
			int a=10,b=20;    // a= 1010  
			int c= a&b;		//   b=10100
							//	   00000
			System.out.println("The bitwise and operator: "+c);

			int d=20,e=30;   
			int f=d|e;
			//d= 10100
			//e= 11110
			//   11110
			System.out.println("The bitwise or operator: "+f);
			
			int g=14,h=18;
			int i=g^h;
			//g=1110
		   //h=10010
		   //  11100
			System.out.println("The bitwise xor operator: "+i);
			int j=~12;
			System.out.println("The bitwise not operator: "+j);	
			//arthimetic 
			int m=2+7%3+5*2+12/6+12-6;
			//2+1+10+2+12-6
			System.out.println("The arthematic: "+m);

	}
}
