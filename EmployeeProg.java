// Create a class called Employee that includes three pieces of information as instance variables—a first name (typeString), 
// a last name (typeString) and a monthly salary (double). Your class should have a constructor that initializes the three instance variables. 
// Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application
// named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
// Then give each Employee a 10% raise and display each Employee’s yearly salary again.

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
        else {
            this.monthlySalary=0.0;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        }
        else {
            this.monthlySalary=0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}


public class EmployeeProg {
    public static void main(String[] args) {
        Employee emp1 = new Employee("harsh", "singh", -654);
        Employee emp2 = new Employee("opm", "sir", 62104);
        System.out.println(emp1.getFirstName() + "'s monthly salary : " + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + "'s monthly salary : " + emp2.getMonthlySalary());
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);
        System.out.println("\nSalary after 10% increment\n");
        System.out.println(emp1.getFirstName() + "'s monthly salary : " + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + "'s monthly salary : " + emp2.getMonthlySalary());
    }
}