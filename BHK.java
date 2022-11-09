public class BHK {
    public static void main(String[] args)
    {

        twoBHK b1 = new twoBHK(100,100,100,100);
        twoBHK b2 = new twoBHK(200,200,200,200);
        twoBHK b3 = new twoBHK(300,300,300,300);
        b1.show();
        b2.show();
        b3.show();
        System.out.println(oneBHK.count);

    }
}
class oneBHK
{
    static int count = 0;

    int roomArea;
    int hallArea;
    int price;
    oneBHK()
    {
        count++;
    }
    oneBHK(int roomArea,int hallArea,int price)
    {
        this.hallArea=hallArea;
        this.price=price;
        this.roomArea=roomArea;
    }
    void show()
    {
        System.out.println(hallArea+" "+roomArea+" "+price);
    }
}
class twoBHK extends oneBHK
{
    int room2Area;
    twoBHK()
    {
        count++;
    }
    twoBHK(int roomArea,int hallArea,int room2Area,int price)
    {
        this.hallArea=hallArea;
        this.price=price;
        this.roomArea=roomArea;
        this.room2Area=room2Area;
    }
    void show()
    {
        System.out.println(hallArea+" "+roomArea+" "+room2Area+" "+price);
    }
}
