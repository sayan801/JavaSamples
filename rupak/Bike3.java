class Bike3
{  
  final void run()
  	{
  		System.out.println("running");
    }  
}  
     
class Honda extends Bike3
{  
   void run()
   	{
   		System.out.println("running safely with 100kmph");
   	}  
     
   public static void main(String args[])
   	{  
   		Honda h= new Honda();  
   		h.run();  
   	}  
} 