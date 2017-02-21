package app;
class person
{
    String name;
    int age;
    void speak()
    {
        System.out.println("My name is: "+name);
    }
 
}
public class App 
{
    public static void main(String[] args) 
    {
        person pr=new person();
        pr.name="RUPAK";
        pr.age=25;
        pr.speak();
    }
    
}
