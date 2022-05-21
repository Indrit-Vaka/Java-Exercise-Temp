/**
 * By Indrit Vaka
 */
public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.ID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            System.out.println("Pagesa duhet te jete >0");
            return;
        }
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int persent) {
        salary *= (double) (persent + 100) / 100;
        /*
         * ex rritja = 40%
         * (40+100)/100 = 1.40
         * 100=> Vlera e prod aktual
         * vl prod = 100=> 100*1.4 = 140
         */
        return salary;
    }

    public String toString() {

        return String.format("Author[id = %d, name = %s ,salary = %d]", ID, getName(), salary);
    }
}
