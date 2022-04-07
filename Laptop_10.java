import java.util.*;
class Laptop_10
{
    String name;
    double price,dis,amt;
    Laptop_10()
    {
        name="";
        price=0.0;
        dis=0.0;
        amt=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the customer: ");
        name=sc.nextLine();
        System.out.print("Enter the price of the laptop: ");
        price=sc.nextDouble();
    }//end of input
    void calculate()
    {
        if(price<=25000.0)
        dis=5.0;
        else if(price>=25001 && price<=50000)
        dis=7.5;
        else if(price>=50001 && price<=100000)
        dis=10.0;
        else if(price>100000)
        dis=15.0;

        amt=price-((dis/100.0)*price);
    }//end of calculate
    void display()
    {
        System.out.println("Name of the customer: "+name);
        System.out.println("Discount of laptop: "+dis+" %");
        System.out.println("Amount to be paid after discount: Rs"+amt);
    }//end of display
    public static void main(String args[])
    {
        Laptop_10 lap=new Laptop_10();//calling constructor
        lap.input();
        lap.calculate();
        lap.display();
    }//end of main
}//end of class
