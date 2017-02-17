class consoverld
{  
    int id;  
    String name;  
    int age;  
    consoverld(int i,String n,int a)
    {  
    	id = i;  
    	name = n;
    	age=a;  
    }  
    /*consoverld(int i,String n)
    {  
    	id = i;  
    	name = n;  
    	  
    } */
    void display()
    {
    	System.out.println(id+" "+name+" "+age);
    }  
   
    public static void main(String args[])
    {  
    consoverld s1 = new consoverld(111,"Karan",23);  
    consoverld s2 = new consoverld(222,"Rupak",25);  
    s1.display();  
    s2.display();  
   }  
}  