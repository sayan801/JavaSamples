package student;
public class Student 
{  
    int rno;  
    String nme;  
    String cty;  
 
 Student(int rollno, String name, String city)
 {  
    this.rno=rollno;  
    this.nme=name;  
    this.cty=city;  
 }  
  
 public static void main(String args[])
 { 
    Student s1=new Student(101,"Raj","lucknow");  
    Student s2=new Student(102,"Vijay","ghaziabad");
   
   
    System.out.println("My name is: "+s1);
    System.out.println("My name is: "+s2);  
 }  
}  