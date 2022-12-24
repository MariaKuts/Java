package lab18.task1;
import java.util.Scanner;
import java.lang.Exception;
import java.util.Scanner;

public class ThrowsDemo1
{
    public void getKey()
    {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        printDetails (key);
    }
    public void printDetails(String key)
    {
        try
        {
            String message = getDetails (key);
            System.out.println( message );
        } catch (Exception e) {throw e;}
    }
    private String getDetails(String key)
    {
        if (key == "")
        {
            try {throw new Exception("Key set to empty string");}
            catch (Exception e) {throw new RuntimeException(e);            }
        }
        return "data for " + key;
    }
}
