//fibnocci series of n numbers
import java.util.Scanner;
class Fib{
    public static void main(String[] args){
        int a=0,b=1,i,c;
        
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        
        System.out.println(a+"\n"+b);
        for(i=2;i<count;++i){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }
}