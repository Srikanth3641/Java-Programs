import java.util.Scanner;
class CelciusCoverter{
    float celcius;
    float farenheit;
    public static void main(String[] args){
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter farenheit:");
        t.farenheit=sc.nextFloat();
        t.temp();
    }
    public void temp(){
       celcius=(farenheit-32)*5/9;
       System.out.println(celcius);
    }