class rectangle1
{  
 int length;  
 int width;  
  
 void insert(int l,int w)
 {  
  length=l;  
  width=w;  
 }  
  
 void calculateArea()
 {
 	System.out.println(length*width);
 }  
  
 public static void main(String args[])
 {  
  rectangle1 r1=new rectangle1(); //creating two objects  
  rectangle1 r2=new rectangle1(); //creating two objects  
    
  r1.insert(11,5);  
  r2.insert(3,15);  
  
  r1.calculateArea();  
  r2.calculateArea();  
 }  
}  