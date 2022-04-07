import java .util.*;
class Stream 
{
    String name;
    double phy,chem,bio,mat,avg;
    Stream(String n,double p,double c,double b,double m,double a)
    {
        name=n;
        phy=p;
        chem=c;
        bio=b;
        mat=m;
        avg=a;
    }
    void choiceStream()
    {
        Scanner sc=new Scanner(System.in);
        //inatializing the instance variables
        System.out.print("Enter the name of student: ");
        name=sc.nextLine();
        System.out.print("Enter the marks in Physics: ");
        phy=sc.nextDouble();
        System.out.print("Enter the marks in Chemistry: ");
        chem=sc.nextDouble();
        System.out.print("Enter the marks in Biology: ");
        bio=sc.nextDouble();
        System.out.print("Enter the marks in Mathematics: ");
        mat=sc.nextDouble();

        //calculating average marks
        avg=(phy+chem+bio+mat)/4.0;

        if(avg>90)
        System.out.println("Eligible for Science");
        else if(avg>70 && avg<90)
        System.out.println("Eligible for Commerce");
        else if(avg<=70)
        System.out.println("Eligible for Humanities");
    }//end of choiceStream()
    void display()
    {
        System.out.println("Name of student: "+name);
        System.out.println("Marks in Physics: "+phy);
        System.out.println("Marks in Chemistry: "+chem);
        System.out.println("Marks in Biology: "+bio);
        System.out.println("Marks in Mathematics: "+mat);
        System.out.println("Average marks: "+avg);
    }//end of display()
    public static void main(String args[])
    {
        Stream s = new Stream("",0.0,0.0,0.0,0.0,0.0);
        s.choiceStream();
        s.display();
    }//end of main()
}//end of class
