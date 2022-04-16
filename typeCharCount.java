import java.util.*;
class typeCharCount
{
    public static void main(String args[])
    {
        char ch;
        int upperC=0,lowerC=0,BS=0,tDig=0,TCS=0,tLetters=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s=sc.nextLine();
        
        //calculating total typeChar count
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch)){
            tLetters++;//total Letters
            }
            if(Character.isUpperCase(ch))
            upperC++;//total uppercase letters
            else if(Character.isLowerCase(ch))
            lowerC++;//total lowercase letters
            else if(Character.isWhitespace(ch))
            BS++;//Total Blank Space
            else if(Character.isDigit(ch))
            tDig++;//Total Digits
            else
            TCS++;//total special characters
        }//end of forloop()
        //Display()
            System.out.println("Total uppercase Characters: "+upperC);
            System.out.println("Total lowercase Characters: "+lowerC);
            System.out.println("Total blank space: "+BS);
            System.out.println("Total Digits: "+tDig);
            System.out.println("Total Letters: "+tLetters);
            System.out.println("Total Special Characters: "+TCS);
        
    }//end of main()
}//end of class
