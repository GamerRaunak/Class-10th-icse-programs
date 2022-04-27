import java.util.*;
class Palindrome_word
{
    public static void main(String []args)
    {
        boolean Pl=false,p=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String w=sc.next();
        int len=w.length();
        if(w.charAt(0)==w.charAt(len-1)){
            Pl=true;
            for(int i=1;i<len/2;i++)
            {
                if(w.charAt(i)!=w.charAt(len-1-i))
                {
                    p=true;
                    break;
                }
            }
        }
        
            if(Pl==true&&p==false)
            System.out.println("Palindrome word");
            else if(Pl==true&&p==true)
            System.out.println("Palindrome-like word");
            else
            System.out.println("Not a Palindrome or Palindrome-like word");
    }
}/*bugs REMOVED*/
