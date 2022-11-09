import java.util.Scanner;

public class employee
{
    String name;
    int id;
    String result;
    int ass1;
    int ass2;
    int ass3;
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        employee e1 = new employee();
        System.out.println("enter name ");
        e1.name = sn.next();
        System.out.println("enter id ");
        e1.id = sn.nextInt();
        System.out.println("enter ass1 mark ");
        e1.ass1=sn.nextInt();
        System.out.println("enter ass2 mark ");
        e1.ass2=sn.nextInt();
        System.out.println("enter ass1 mark ");
        e1.ass3=sn.nextInt();
        res(e1.ass1,e1.ass2,e1.ass3);
    }

    static void res(int ass1, int ass2,int ass3)
    {
        if (ass1 >= 75 && ass2 >= 75 && ass3 >= 75)
        {
            System.out.println("Promoted");
        }
        else {
            System.out.println("Demoted");
        }
        int fin = ass1 + ass2 + ass3;
        System.out.println("Total ="+fin);
        int fin2 = ((fin*100)/300);
        System.out.println("Percentage="+fin2);
    }
}
