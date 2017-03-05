package mycredit;
import java.util.Scanner;
public class Mycredit 
{
    public double Mycredit(double number,double number1)
    {
        double balance = number;
        double pay = number1;
        double newbalance = balance-pay;
        System.out.println("My new balance is: "+newbalance);
        return newbalance;
    }
    /*public void Mycredit1()
    {}*/
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter your balance: ");
        double number=s.nextDouble();
        System.out.println("Your balance is:" +number);
                
        System.out.println("Enter your payment: ");
        double number1=s.nextDouble();
        System.out.println("Your payment is: "+number1);
        
        Mycredit cr=new Mycredit();
        //balance.Mycredit();
        //pay.Mycredit();
        cr.Mycredit(number,number1);
        //cr.Mycredit();
    }
    
}
