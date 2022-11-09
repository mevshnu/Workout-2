import java.util.Random;
public class med {
    public static void main(String[] args)
    {

        Tablet t1 = new Tablet("ABC","CDE",87);
        Syrup s1 = new Syrup("v","kj",56);
        Ointment o1 = new Ointment("kj","lkj",76);
        int max = 4;
        int min = 1;
        Random random = new Random();
        int b = random.nextInt(max - min) + min;
        if (b == 1)
        {
            t1.displayLabel();
        }
        else if(b==2)
        {
        s1.displayLabel();
        }
        else
    {
        o1.displayLabel();
    }

    }
}
class Medicine
{
    String Name;
    String Address;
    void displayLabel(String Name,String Address)
    {
        this.Name=Name;
        this.Address=Address;
        System.out.println(this.Name+" "+this.Address);

    }
}
class Tablet extends Medicine
{

    int gram;
    Tablet(String Name,String Address,int gram)
    {
        this.Name=Name;
        this.Address=Address;
        this.gram=gram;
    }
    void displayLabel()
    {

        System.out.println(this.Name+" "+this.Address+" "+ this.gram);

    }
}
class Syrup extends Medicine
{
    int gram;
    Syrup(String Name,String Address,int gram)
    {
        this.Name=Name;
        this.Address=Address;
        this.gram=gram;
    }
    void displayLabel()
    {

        System.out.println(this.Name+" "+this.Address+" "+ this.gram);

    }
}
class Ointment extends Medicine
{
    int gram;
    Ointment(String Name,String Address,int gram)
    {
        this.Name=Name;
        this.Address=Address;
        this.gram=gram;
    }
    void displayLabel()
    {

        System.out.println(this.Name+" "+this.Address+" "+ this.gram);

    }
}
