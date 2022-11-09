import java.util.*;
public class ThreeClass
{
    public static void main(String[] args) {


            FullTimeFaculty f1 = new FullTimeFaculty(4,100,200);
            FullTimeFaculty f2 = new FullTimeFaculty(3,100,400);
            PartTimeFaculty p1 = new PartTimeFaculty(2,500,1000);
            PartTimeFaculty p2 = new PartTimeFaculty(1,500,2000);
            System.out.println("id "+p1.facultyid+" "+ "salary "+p1.Partsalary);
            System.out.println("id "+p2.facultyid+" "+ "salary "+p2.Partsalary);
            System.out.println("id "+f1.facultyid+" "+"salary "+ f1.Fullsalary);
            System.out.println("id "+f2.facultyid+" "+ "salary 1"+f2.Fullsalary);
            System.out.println("enter 1 for FullTimeFaculty or 2 for PartTimeFaculty");
            Scanner sc = new Scanner(System.in);
            int in=sc.nextInt();
            if(in ==1)
            {
                inputs1();
            } else if (in == 2)
            {
                inputs2();
            }
            else
            {
                System.out.println("wrong input");
            }

    }
   static void inputs1()
    {
        FullTimeFaculty ff1 = new FullTimeFaculty();
        Scanner sn = new Scanner(System.in);
        System.out.println("enter employee id");
        ff1.facultyid= sn.nextInt();
        System.out.println("enter employee basic");
        ff1.basic = sn.nextInt();
        System.out.println("enter employee allowance");
        ff1.allowance= sn.nextInt();
        int Fullsalary = ff1.basic + ff1.allowance;
        System.out.println("id "+ff1.facultyid+" "+ "salary "+Fullsalary);
 }
    static void inputs2()
    {
        PartTimeFaculty pp1 = new PartTimeFaculty();
        Scanner sn = new Scanner(System.in);
        System.out.println("enter employee id");
        pp1.facultyid = sn.nextInt();
        System.out.println("enter employee hour");
        pp1.hour = sn.nextInt();
        System.out.println("enter employee rate");
        pp1.rate= sn.nextInt();
        int Partsalary = pp1.hour + pp1.rate;
        System.out.println("id "+pp1.facultyid+" "+ "salary "+Partsalary);
    }

}
    class Faculty
    {
        int facultyid;
        int salary;
    }
    class FullTimeFaculty extends Faculty
    {
        int basic;
        int allowance;
        int Fullsalary;
        FullTimeFaculty()
        {

        }
        FullTimeFaculty(int facultyid,int basic,int allowance)
        {
            this.facultyid=facultyid;
            this.basic = basic;
            this.allowance=allowance;
            Fullsalary = this.basic + this.allowance;
        }


    }
    class PartTimeFaculty extends Faculty
    {
        int hour;
        int rate;
        int Partsalary;
        PartTimeFaculty()
        {

        }
        PartTimeFaculty(int facultyid,int hour,int rate)
        {
            this.facultyid=facultyid;
            this.hour= hour;
            this.rate= rate;
            Partsalary = this.hour * this.rate;
        }
    }


