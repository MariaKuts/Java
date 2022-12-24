package lab14.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^(0[1-9]|2[0-9]|3[0-1])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$") ;

    public static void test ()
    {
        assert true;
        checkString ("29/02/2000");
        assert true;
        checkString("30/04/2003");
        assert true;
        checkString("01/01/2003");
        assert false;
        checkString("29/02/2001");
        assert false;
        checkString("30-04-2003");
        assert false;
        checkString("1/1/1899");
    }

    static private boolean checkString(final String dateAsString)
    {
        Matcher m = DATE_PATTERN.matcher(dateAsString) ;
        boolean result = m.matches() ;
        if (result)
        {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if(year<1900 || year>9999) return false;
            else
            {
                if (day == 29 && month == 2)
                {
                    if (year % 4 != 0) return false;
                    else return true;
                }
                if (day == 30)
                {
                    if (month == 2) return false;
                    else return true;
                }
                if (day > 30)
                {
                    if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) return false;
                    else return true;
                }
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        assert true;
        System.out.println("29/02/2000: " + checkString ("29/02/2000"));
        assert true;
        System.out.println("31/04/2006: " + checkString("31/04/2006"));
        assert true;
        System.out.println("07/04/1898: " + checkString("07/04/1898"));
        assert false;
        System.out.println("29/02/2001: " + checkString("29/02/2001"));
        assert false;
        System.out.println("30-04-2003: " + checkString("30-04-2003"));
        assert false;
        System.out.println("1/1/1899: " + checkString("1/1/1899"));
    }
}
