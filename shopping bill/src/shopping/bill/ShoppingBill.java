
package shopping.bill;

import java.util.Scanner;


public class ShoppingBill {

   static int count=0,pur,tamt; 
   static double smt,total;
    public static void main(String[] args) 
    {
    Scanner s=new Scanner (System.in);
       smt = s.nextDouble();
     
       if(10000<=smt&&smt<=19999)
     {
        count=1; 
     }
      else if(20000<=smt&&smt<=29999)
     {
        count=2; 
     }
      else if(30000<=smt&&smt<=39999)
     {
        count=3; 
     }
     else if(40000<=smt)
     {
        count=4; 
     }
       
       switch(count)
       {
           
           case 1:total=(smt*10)/100;
           System.out.println("total discount"+total);
           break;
           case 2:total=(smt*50)/100;
           System.out.println("total discount"+total); break;
           case 3:total=(smt*62.5)/100;
           System.out.println("total discount"+total); break;
          case 4:total=((smt-40000)*70)/100;
           System.out.println("total discount"+total); break;
          default :total=smt*0;
              System.out.println("total discout"+total);
       }
    }

}
    

