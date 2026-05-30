package phase1_core_java;

import java.util.Map;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private Employee manager;

    public Employee(String employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.manager = null;
    }

    public Employee(String employeeId, String name) {
        this(employeeId, name, "General", 30000);
    }

    public void assignManger(Employee mgr){
        manager = mgr;
        System.out.println(name + "s manger is: "+mgr.name);
    }


    public void appraise(double increment)
    {
        System.out.println("Old Salary :"+ salary);
        salary += increment;
        System.out.println("New Salary :"+ salary);
    }

    public void displayDetails(){
        System.out.println("----------- Employee Details --------");
        System.out.println("Emp Id : " +employeeId);
        System.out.println("EmpName : " +name);
        System.out.println("Emp Salary : " +salary);
        System.out.println("Emp dept : " +department);
        if (manager != null){
            System.out.println("Emp manager : " +manager.name);

        }
    }

    public void printMyDetails(){
        printEmployee(this);
    }

    public static void printEmployee(Employee emp){
        System.out.println("Static method ");
        System.out.println("EmpName : " +emp.name);
        System.out.println("Emp Salary : " +emp.salary);
        System.out.println("Emp dept : " +emp.department);
    }

    public static void main(String[] args) {
        Employee manger = new Employee("MGR1", "Sharma", "Engineering", 80000);
        Employee emp1 = new Employee("EMP1", "Swati", "Backend", 80000);
        Employee emp2 = new Employee("EMP2", "Anu");

        emp1.assignManger(manger);
        emp2.assignManger(manger);

        emp1.appraise(10000);

        manger.displayDetails();
        emp1.displayDetails();
        emp2.displayDetails();

        System.out.println("Using this as object");
        emp1.printMyDetails();
        emp2.printMyDetails();
    }
}
