import java.time.Year;
public class Employee extends Person{
    private int hireDate;
    private String companyName;
    private double salary;
    public Employee(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;

    }
    public int getJobSeniority() {
        return Year.now().getValue() - hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}

