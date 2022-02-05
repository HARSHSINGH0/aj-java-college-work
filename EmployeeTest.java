class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	void setFirstName(String fName) {
		firstName = fName;
	}

	void setLastName(String lName) {
		lastName = lName;
	}

	void setMonthlySalary(double mSalary) {
		monthlySalary = mSalary;
	}

	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	double getMonthlySalary() {
		return monthlySalary;
	}

	void showEmployeeDetails() {
		System.out.println("Employee first name: " + firstName);
		System.out.println("Employee last name: " + lastName);
		if(monthlySalary<0) {
			System.out.println("Yearly Salary: 0.0");
		} else {
			double yearlySalary = monthlySalary*12;
			System.out.println("Yearly Salary: " + yearlySalary);
		}
	}

	void raise10Percent() {
		if(monthlySalary<0) {
			System.out.println("Yearly salary incremented to: 0.0");
		} else {
			double yearlySalary = monthlySalary*12;
			double increment = yearlySalary + (yearlySalary*10/100);
			System.out.println("Yearly salary incremented to: " + increment);
		}
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		System.out.println("Employee One Details :");
		Employee emp1 = new Employee();
		emp1.setFirstName("Siddharth");
		emp1.setLastName("Bhat");
		emp1.setMonthlySalary(-20000);
		emp1.showEmployeeDetails();
		emp1.raise10Percent();
		System.out.println("");
		System.out.println("Employee Two Details :");
		Employee emp2 = new Employee();
		emp2.setFirstName("Omprakash");
		emp2.setLastName("Mandge");
		emp2.setMonthlySalary(320000);
		emp2.showEmployeeDetails();
		emp2.raise10Percent();
	}
}