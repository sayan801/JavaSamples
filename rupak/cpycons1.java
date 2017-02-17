class cpycons1
{  
    int id;  
    String name;
      
    cpycons1(int i,String n)
    {  
    	id = i;  
    	name = n;  
    }  
    cpycons1()
    {
    }  
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
    cpycons1 s1 = new cpycons1(111,"Karan");  
    cpycons1 s2 = new cpycons1();// if we use (111,"Karan")this line.. o/p 0,null:0,null 
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  