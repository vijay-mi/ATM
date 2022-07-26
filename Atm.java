import java.util.Scanner;

class Details
{
    int Id1 = 10001;
    String UserName1 = "Andreo";  

    int Id2 = 10002;
    String UserName2 = "RAFEL";
    
    int Id3 = 10003;
    String UserName3 = "JACK";  

    String p;
    int n50=4, n100=3, n200=6, n500=9, n2000=6;
    int a,c,d,e,f,g;
    int acbalance=1150, atmbalance=18200, withdraw=0;
    public boolean match()
    {
        if(a == Id1 && p.equals(UserName1))
        {
            return true;
        }
        else if(a == Id2 && p.equals(UserName2))
        {
            return true;
        }
        else if(a == Id3 && p.equals(UserName3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void enter()
   {
     Scanner s=new Scanner(System.in);
     
      a = s.nextInt();
    }
    public int enter1()
   {
     Scanner s=new Scanner(System.in);
     
      return s.nextInt();
    }
   public void enters()
   {
     Scanner s=new Scanner(System.in);

     p=s.nextLine();
   }
   
   public void Transaction()
   {
       System.out.println("Enter withdrawl amount");
       withdraw = enter1();
       if(withdraw>acbalance)
       {
           System.out.println("Insufficient balance in the account");
           if(withdraw>atmbalance)
           {
               System.out.println("Cash Not Available");
              
           }
       } 
        else
       {
           if(withdraw>atmbalance)
           {  
               System.out.println("Cash Not Available");
              
           }
           else
           {
               if(withdraw%50==0)
               {
                    acbalance = acbalance - withdraw;
                    c=withdraw/2000;
                    d=(withdraw-c*2000)/500;
                    e=((withdraw-(c*2000))-(d*500))/200;
                    f=(((withdraw-(c*2000))-(d*500))-(e*200))/100;
                    g=((((withdraw-(c*2000))-(d*500))-(e*200))-(f*100))/50;
                    n2000=n2000-c;
                    n500=n500-d;
                    n200=n200-e;
                    n100=n100-f;
                    n50=n50-g;
                    
                    atmbalance = atmbalance - withdraw;
                    
                    System.out.println("Collect your cash.... Please revisit again....");
                    System.out.println("Notes delivered");
                    System.out.println("2000X"+c+"="+(c*2000));
                    System.out.println("500X"+d+"="+(d*500));
                    System.out.println("200X"+e+"="+(e*200));
                    System.out.println("100X"+f+"="+(f*100));
                    System.out.println("50X"+g+"="+(g*50));
                    System.out.println("Your remaining Balance = "+acbalance);
                    
           }

           
       }
   }
   }
      
public void checkbalance()
      {
          System.out.println("Your Balance = "+acbalance);
      }
   
   
}   


public class Atm 
{

    
    public static void main(String[] args)
    { 
               int ch;
           Details a1=new Details();
           System.out.println("Enter User Id");
           a1.enter();
           System.out.println("Enter User Name");
           a1.enters();

        
    
    if(a1.match())
    {
          System.out.println("  Choose the Transaction   ");
          System.out.println("1-Withdrawl ");
          System.out.println("2-CheckBalance");  
          ch=a1.enter1();
           switch(ch)
  {
    case 1:
    a1.Transaction();
    break;
    case 2:
    a1.checkbalance();
    break;
    default:
    System.out.println("Invalid input");
    }
     
    }
else
    {
        System.out.println("Invalid user id or user name");
    }
    }
}
