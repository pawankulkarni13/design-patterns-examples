package structural.composite.companyemployee;

public class Manager implements Employee{
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public void showEmployeeDetails()
    {
        System.out.println(empId+" " +name);
    }
}
