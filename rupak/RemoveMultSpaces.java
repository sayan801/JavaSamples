package removemultispace;
import java.util.StringTokenizer;
public class RemoveMultSpaces 
{
    public static void main(String a[])
    {
        String str = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreElements())
        {
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
