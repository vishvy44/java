package atmpro;
import java.util.*;
class atm
{ int ba=20000000;
Scanner s=new Scanner(System.in);
    public void cw()
    { int d;
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            CASH WITHDRAWL                 ");
          System.out.print("\n         ENTER THE AMOUNT U WANT IN NUMBERS :- ");
          d=s.nextInt();
          
          if(d<=ba)
          {       
                   
               System.out.println("\n                       YOUR CURRENT BALANCE WAS -- "+ba);
                System.out.println("\n\n                        AMOUNT WITHDRAWN --- "+d);
                ba=ba-d;
                 System.out.println("\n                   NEW UPDATED BALANCE IS--"+ba+"\n");
                  
          }
          else
          {
               System.out.print("\n\n\n\n\\n\n\n\n\n\n\n\n\n\n\n\n              OOPS !! YOUR BALANCE IS LOW\n\n\n       ");
          }
    }
    public void cb()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            BALANCE CHECK                ");
     System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                YOUR CURRENT BALANCE IS--- "+ba+"\n\n\n\n\n");   
    }
    public void cd()
    { int d;
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            CASH DEPOSIT               ");
      System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                   ENTER THE AMOUNT U WANT TO ADD--");
      d=s.nextInt();
      System.out.println("\n                       YOUR CURRENT BALANCE WAS -- "+ba);
                System.out.println("\n                        AMOUNT ADDED --- "+d);
                ba=ba+d;
                 System.out.println("\n                      NEW UPDATED BALANCE IS--"+ba);
                  System.out.println("\n                               THANKYOU         ");
    }   
    public void ms()
    { int i;
     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         MINI STATEMENT(YOUR RECORD)                ");   
     System.out.println("NAME -VISHAL YADAV    ACC.NO--134TU34O9P   CONTACTINFO- 8826005874"); 
     for(i=1;i<5;i++)
      {    
          System.out.print("CASH WITHDRAWN ON "+i*3+"-june-2017 :-"+i*4+"000");
          System.out.println("           CASH DEPOSIT ON "+i*4+"-june-2017 :-"+i*3+"000");
      
      }
    }
       public static void main(String []args)
    { 
        int a,c,d;
    Scanner s=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      System.out.print("                    DO YOU WANT TO CONTINUE WITH SUICIDE BANK\n                     ENTER 1 TO CONTINUE AND 2 TO QUIT-- ");
       d=s.nextInt();
       if(d==1)
       {
            System.out.println("\n\n\n\n\n\n                                   ATM         ");
         System.out.print("                             SUICIDE BANK PVT.LTD.       ");
          System.out.print("\n\n\n\n                    ENTER THE PIN TO CONTINUE :--     ");
          a=s.nextInt();
          atm o=new atm();
          if(a==1235)
          {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            WELCOME VISHAL          ");
            
             System.out.println("         1.CASH WITHDRAWL \t\t        2.CURRENT BALANCE \n\n\n         3.CASH DEPOSIT \t\t        4.MINI STATEMENT ");
           System.out.print("\n          ENTER ANY ONE OPTION(NUMBER) TO CONTINUE --- ");
              c=s.nextInt();
              switch(c)
              {
                  case 1:
                  {
                      o.cw();
                      break;
                  }
                  case 2:
                  {
                      o.cb();
                      break;
                  }
                  case 3:
                  {
                      o.cd();
                     break;
                  }
                  case 4:
                  {
                      o.ms();
                      break;
                  }
                  default :
                  {
                       System.out.print("\n       ENTER THE VALID CHOICE ");
                  }
              }
          }
          
          else
          {
               System.out.println("\n\n\n\n\n\n\n                                            WRONG KEY TRY AGAIN \n              ");
          
          }
          
       }
       else
       {
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n                         THANKYOU FOR USING SUICIDE BANK ATM-- MAY U LIVE LONG!!\n\n\n\n");  
               break;
       }
    }
    }     
}