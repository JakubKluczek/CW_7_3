public class Manager extends Employee{
    private double bonus;


    public Manager(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireYear, companyName, salary);
        this.bonus= bonus;
    }
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public String toString() {
        return "Manager: " + getFirstName() + " " + getLastName() +" "+
                "wiek: " + getAge() +" "+
                "firma: " + getCompanyName() +" "+
                "rok zatrudnienia: " + getHireYear() +" "+
                "staż pracy: " + getJobSeniority() + " years" +" "+
                "wynagrodzenie: " + getSalary();
    }
}
