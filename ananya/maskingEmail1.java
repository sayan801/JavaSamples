
import java.util.Scanner;

public class maskingEmail1
{
	public static void main(String args[])
	{
		String Email = maskingEmailId("ananyasinha5@gmail.com");
		System.out.println("Mail Id: " + Email);
	}
	

public  static String maskingEmailId(String mailid)
    {
         String mailid3 = "", mailidmask = "";
        try
        {
            int position = mailid.indexOf("@");
            String mlid = mailid.substring(position);
            int mlidlen = mlid.length();
            if(mlidlen>3)
            {
                String mailid1 = mailid.substring(0,3);
                String mailid12 = mailid.substring(3,position);
                int len = mailid12.length();
                char[] mailid21 = mailid12.toCharArray();

                for(int i=0;i<len;i++)
                {
                    mailid21[i] = 'X';

                }
                String output1 = new String(mailid21);

                String mailid2 = mailid1.concat(output1);

                mailid3 = mailid.substring(position);

                mailidmask = mailid2.concat(mailid3);
            }
            else
            {
                char [] mlid12 = mlid.toCharArray();
                for(int i=0;i<mlidlen;i++)
                {
                    mlid12[i] = 'X';

                }
                String output2 = new String(mlid12);
                mailidmask = output2.concat(mailid3);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return mailidmask;
    }
}












