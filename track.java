public class track
{
    static int count = 0;
    static int fla = 0;
    public static void main(String[] arg)
    {
         int flag =0;
         track x = new track();
         track y = new track();
         track z = new track();
        track w = new track();
         z = null;
        System.gc();
        System.out.println("created "+count);
        System.out.println("alive "+fla);
        int de = count - fla;
        System.out.println("Destroyed "+de);
    }
    track()
    {
        count++;
        fla++;
    }
    protected void finalize()
    {
        fla--;
        System.out.println("garbage");
    }

}