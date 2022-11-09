import java.util.Scanner;

public class MathFunction {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the numbers");
        float a = sn.nextFloat();
        float b = sn.nextFloat();
        multiply(a,b);
    }
    static void multiply(float a,float b)
    {
        float c = a + b;
        System.out.println(c);
    }
}
