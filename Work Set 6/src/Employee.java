public class Employee {
    protected String name;
    protected String id;
    protected double salary;
    String dateOfBirth;
    String hireDate;
    String job;


    // Constructor

    public Employee(String name, String dateOfBirth, String hireDate, String job, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.job = job;
        this.salary = salary;
    }

    public Employee() {

    }


    // methods and attributes

    void promote(double amount) {
        this.salary += amount;
    }

    public double getRaise() {
        return this.salary * 0.10;
    }

    double calculateAnnualSalary(double amount) {
        return (this.salary * 12.0);
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dateOfBirth);
        System.out.println("Hiring Date: " + this.hireDate);
        System.out.println("Job: " + this.job);
        System.out.println("Salary: " + this.salary);
        System.out.println("Annual Salary: " + this.calculateAnnualSalary(this.salary));
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
