import java.util.Scanner;

public class home {
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("enter tiles lenght");
        Tile u = new Tile();
        u.edgeLength= sn.nextInt();
        int x = u.area(u.edgeLength);
        System.out.println("enter halls lenght ");
        Floor v = new Floor();
        v.floorLength=sn.nextInt();
        System.out.println("enter halls width");
        v.floorWidth = sn.nextInt();
        int y = v.totalTiles(v.floorLength,v.floorWidth);
        float z = y/x;
        System.out.println(z+" Tiles");

    }
}
class Tile
{
    static int edgeLength;
    int area(int edgeLength)
    {
        int area1 = this.edgeLength * this.edgeLength;
        return area1;
    }
}
class Floor
{
    static int floorLength;
    static int floorWidth;
    int totalTiles(int floorLength,int floorWidth)
    {
        int area2 = this.floorLength * this.floorWidth;
        return area2;
    }
}

