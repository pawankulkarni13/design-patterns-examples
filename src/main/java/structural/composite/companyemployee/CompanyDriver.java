package structural.composite.companyemployee;

public class CompanyDriver {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Pawan", "Pro Developer");
        Employee dev2 = new Developer(101, "Guru", "Developer");

        var engDirector = new CompanyDirector();
        engDirector.addEmployee(dev1);
        engDirector.addEmployee(dev2);

        Manager man1 = new Manager(200, "Stark", "SEO Manager");
        Manager man2 = new Manager(201, "Nandan ", "Stark's Manager");

        CompanyDirector accDirector = new CompanyDirector();
        accDirector.addEmployee(man1);
        accDirector.addEmployee(man2);

        CompanyDirector director = new CompanyDirector();
        director.addEmployee(engDirector);
        director.addEmployee(accDirector);
        director.showEmployeeDetails();
    }
}
