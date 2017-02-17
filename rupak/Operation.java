class Operation
{  
 int data=400;  
  
 void change(int data)
 	{  
 		data=data+100;
 		                     //changes will be in the local variable only  
    }  
     
 public static void main(String args[])
 	{  
   		Operation op=new Operation();  
  
   		System.out.println("before change "+op.data);  
   		op.change(200);  
   		System.out.println("after change "+op.data);   
  
   }  
} 