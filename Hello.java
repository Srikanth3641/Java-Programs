class Hello{
    static int a=10;   //static variable
    static int b=20;
    public static void main(String[] args)
    {
        square();
    }
    public static void square(){
        int temp=a+b;
        System.out.println(temp);
    }
}