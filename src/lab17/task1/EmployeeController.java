package lab17.task1;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeDays_number(float days_number)
    {
        model.setDays_number(days_number);
    }
    public void setEmployeeSalary_month() { model.setSalary_month(); }

    public double getEmployeeSalary_month() { return model.getSalary_month(); }
    public void setEmployeeSalary_hour(float salary_hour)
    {
        model.setSalary_hour(salary_hour);
    }
    public void setEmployeeHours_number(float hours_number)
    {
        model.setHours_number(hours_number);
    }
    public double getEmployeeCost_hour() {return model.getSalary_hour();}
    public double getEmployeeDays_number() {return model.getDays_number();}
    public double getEmployeeHours_number() {return model.getHours_number();}
    public void updateView()
    {
        view.printEmployeeDetails(model.getSalary_hour(),
                model.getHours_number(), model.getDays_number(), model.getSalary_month());
    }
}