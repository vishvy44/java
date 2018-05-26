package login3;
import java.util.*;
class logi
{
    public static void main(String []args)
    {
        int count=0,i;
       String a,b;
       Scanner s=new Scanner(System.in);
       System.out.println("welcome to microextrasoft ");
       System.out.println("please log in to continue");
       System.out.print("ENTER THE USERNAME :--");
       a=s.next();
       if(a.equals("admin"))
       {
           System.out.println("USER FOUND");
           for(i=0;i<=3;i++)
           {
               if(count>=3)
               {
                   System.out.println("your try limit reached..... you cant access for next 10 minutes");
                   break;
                   
                   
               }
              System.out.print("PASSWORD:---");
              b=s.next();
              if(b.equals("password"))
              {
                  System.out.println("WELCOME ADMIN!!!!");
                  System.out.println("You can continue what u left ..")
                  break;
                  
              }
               else
              {
                  System.out.println("Wrong....try again ");
                  count++;
              }
           }
       }
       else {
           System.out.println("user not found");
       }
    }
}