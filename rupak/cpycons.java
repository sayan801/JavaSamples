class cpycons
{  
    int id;  
    String name;
      
    cpycons(int i,String n)
    {  
    	id = i;  
    	name = n;  
    }  
    cpycons(cpycons s)
    {
    	id=s.id;
    	name=s.name;
    }  
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
    cpycons s1 = new cpycons(111,"Karan");  
    cpycons s2 = new cpycons(s1);  
      
    s1.display();  
    s2.display();  
   }  
} 