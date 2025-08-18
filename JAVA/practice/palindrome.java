class ispalindraome {

    String str;

    public boolean checkPalindrome (String str)
    {
        this.str = str.toLowerCase();
        StringBuilder string= new StringBuilder(this.str);
        StringBuilder revString =new StringBuilder(string);
        revString.reverse();

        // System.out.println(string + " " + revString);
        if (string.toString().equals(revString.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
        
    public boolean revUsingArray(String str)
    {
            this.str = str.toLowerCase();
            char [] strChars=new char[(str.length())];
            char [] revStrChars =new char[(str.length())];

            for(int i=0;i<this.str.length();i++)
            {
                strChars[i] =this.str.charAt(i);
            }
            // System.out.println(strChars);

            for (int i=0;i<this.str.length();i++)
            {
                revStrChars[i] = strChars[(strChars.length-1-i)];
            }
            // System.out.println(revStrChars);

            boolean flag =false;
            for (int i=0;i<strChars.length;i++)
            {
                if (strChars[i]==revStrChars[i])
                {
                    flag = true;
                }else
                {
                    flag= false;
                    break;
                }
            }
            return flag;

    }
    
}

public class palindrome 
{
    public static void main(String[] args) 
    {
        ispalindraome isp = new ispalindraome();
        System.out.println("sid is " +isp.checkPalindrome("sid"));
        System.out.println("naman is "+isp.checkPalindrome("naman"));
        System.out.println("Naman is "+isp.checkPalindrome("Naman"));

        System.out.println("sid is " +isp.revUsingArray("sid"));
        System.out.println("naman is "+isp.revUsingArray("naman"));
        System.out.println("Naman is "+isp.revUsingArray("Naman"));
    }
    
}
