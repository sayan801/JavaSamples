class pcons
{  
    int id;  
    String name;  
      
    pcons(int i,String n)
    	{  
    	id = i;  
    	name = n;  
    	}  
     void run()//void display()
    	{
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[])
   {  
    pcons s1 = new pcons(111,"Karan");  
    pcons s2 = new pcons(222,"Aryan");  
    s1.run();  
    s2.run();  
   }  
} 