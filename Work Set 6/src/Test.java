public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Lux");
        e.setDateOfBirth("09/12/1923");
        e.setHireDate("01/02/2020");
        e.setJob("Java Developer");
        e.setSalary(4800.0);

        e.getRaise();
        e.show();

        Manager a = new Manager();
        a.setPassword(3121);
        a.authenticate(3121);
        a.setJob("Manager");
        a.setName("Lucky");
        a.setSalary(6500.0);

        a.getRaise();
        a.show();

    }
}
