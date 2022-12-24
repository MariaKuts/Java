package lab17.task1;

public class MVCPattern
{
    public static void main(String[] args)
    {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        System.out.println("Данные о сотруднике:");
        controller.updateView();
        controller.setEmployeeSalary_hour(6);
        controller.setEmployeeSalary_month();
        System.out.println("Новые данные о сотруднике:");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase()
    {
        Employee employee = new Employee();
        employee.setSalary_hour(3);
        employee.setHours_number(2);
        employee.setDays_number(4);
        employee.setSalary_month();
        return employee;
    }
}