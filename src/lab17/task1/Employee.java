package lab17.task1;

public class Employee
{
    private double salary_hour;
    private double hours_number;
    private double days_number;
    private double salary_month;
    public void setDays_number(float days_number) {this.days_number = days_number;}
    public void setSalary_hour(float cost_hour) {this.salary_hour = cost_hour;}
    public void setHours_number(float hours_number) {this.hours_number = hours_number;}
    public double getSalary_hour() {return salary_hour;}
    public double getDays_number() {return days_number;}
    public double getHours_number() {return hours_number;}
    public void setSalary_month() {this.salary_month = salary_hour * hours_number * days_number;}
    public double getSalary_month() {return salary_month;}
}