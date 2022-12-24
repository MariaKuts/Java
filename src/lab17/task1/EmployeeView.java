package lab17.task1;

public class EmployeeView
{
    public void printEmployeeDetails(double salary_hour, double hours_number, double days_number, double salary_month)
    {
        System.out.println("количество часов " + hours_number);
        System.out.println("зарплата в час " + salary_hour);
        System.out.println("количество дней " + days_number);
        System.out.println("зарплата в месяц " + salary_month);
    }
}
