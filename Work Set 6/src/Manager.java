public class Manager extends Employee {
    int password;
    int numberOfEmployeesManaged;

    public Boolean authenticate(int password) {
        if (this.password == password) {
            System.out.println("Access Granted!");
            return true;
        } else {
            System.out.println("Access Denied!");
            return false;
        }
    }

    // SETTER

    public void setPassword(int password) {
        this.password = password;
    }


    // METHODS

    @Override
    public double getRaise() {
        return super.getRaise() + 1000;
    }
}