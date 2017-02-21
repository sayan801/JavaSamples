package app1;
class person
{
    String name;
    int age;
    void speak()
    {
        System.out.println("My name is: "+name);
    }
    int retairement()
    {
        int yearsleft=65-age;
        return yearsleft;
    }
}
public class App1 
{
    public static void main(String[] args) 
    {
        person pr=new person();
        pr.name="RUPAK";
        pr.age=25;
        pr.speak();
        
        int year;
        year = pr.retairement();
        System.out.println("years till retirement: "+year);
      
    }
    
}
