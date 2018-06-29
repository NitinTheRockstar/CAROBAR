package retailstore;
 class Retailstore 
{
    String itemname; 
    int quantity;
    double cost;
    
    static double totalcost;
    Retailstore()
    {
        itemname="";
        cost=0;
        quantity=0;
       
    }
      static void setTotalcost(Retailstore jacket,Retailstore jeans,Retailstore shirt )
    {
       totalcost = (jacket.cost*jacket.quantity) + (jeans.cost*jeans.quantity)+(shirt.cost*shirt.quantity);   
    }     void setitemname(String n)
     {
        itemname=n;
     }
     void setquantity(int q)
     {
      quantity=q; 
     }
      void setcost(int c)
     {
      cost=c;
     }
      void getitemname()
     {
     System.out.println(itemname);
     }
     void getquantity()
     {
     System.out.println(quantity);
         
     } 
     void getcost()
     {
              System.out.println(cost);

     }
     static void gettotalcost()
     {
         System.out.println(totalcost);
     }
    public static void main(String[] args) 
    {
        Retailstore jacket=new Retailstore();
    Retailstore jeans=new Retailstore();
    Retailstore shirt=new Retailstore();
    jacket.setitemname("jacket");
    jeans.setitemname("jeans");
    shirt.setitemname("shirt");
    jacket.setquantity(15);
    jeans.setquantity(5);
    shirt.setquantity(10);
    jacket.setcost(250);
    jeans.setcost(250);
    shirt.setcost(250);
    
    setTotalcost(jacket,jeans,shirt);
    gettotalcost();
    }
    
}
