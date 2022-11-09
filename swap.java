public class swap {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        System.out.println("before Swapping"+a+" "+b);
        callByValue(a,b);
        refer d = new refer(5);
        refer c = new refer(10);
        System.out.println("before Swapping"+c.x+" "+d.x);
        callByReference(c,d);
    }
    static void callByValue(int a,int b)
    {
    int flg=b;
    b = a;
    a = flg;
    System.out.println("after Swapping"+a+" "+b);
    }
    static void callByReference(refer c,refer d)
    {
        refer f = new refer(c.x);
         c.x = d.x;
         d.x = f.x;
        System.out.println("after Swapping"+c.x+" "+d.x);
    }

}
class refer
{
    public int x;
    public refer(int x)
    {
        this.x=x;
    }
}