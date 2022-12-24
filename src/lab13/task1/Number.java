package lab13.task1;

public class Number {
    private String phone;
    public void setPhone(String phone) {this.phone = phone;}
    public String getPhone() {return phone;}
    public Number(String phone) {this.phone = phone;}
    public void convertphone()
    {
        String newnumber = "+";
        int a;
        if(phone.charAt(0) == '+') a = 1;
        else a = 0;
        for(int i = a; i < phone.length() - 10; i++)
        {
            newnumber = newnumber + phone.charAt(i);
        }
        int k = 0;
        for(int i = phone.length() - 10; i<phone.length(); i++)
        {
            newnumber = newnumber + phone.charAt(i);
            k++;
            if(k==3 || k==6) {newnumber = newnumber + "-";}
        }
        phone = newnumber;
    }
}
