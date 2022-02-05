class Employee3(){
    private String firstName;
    private String lastName;
    private double salary;
    Employee3(){

    }
    Employee3(){
        String firstName,String lastName,double salary)//constructor{
            this.firstName=firstName;
            this.lastName=lastName;
            this.salary=salary;

        }
        
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setSalary(double salary){
        if(salary<0){
            this.salary=0.0;
        }
        else{
            this.salary=salary;
        }
    }
    //getters
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    double getSalary(){
        return this.salary;
    }
    double annualSalary(){
        //local variable
        double annSal=this.salary*12;
        return annSal;
    }
    void raiseSalary(double factor){
        double raiseAmt=(salary*factor)/100;
        this.salary=this.salary+raiseAmt;
    }
}
class EmployeeTest1(){
    public static void main(String[] args) {
        Employee3 e1=new Employee3("harsh","singh",352);
        System.out.println("Emp Name:"+e1.firstName()+" "+e1.getLastName());
        System.out.println("Monthly Salary:"+e1.getSalary());
        System.out.println("Annual Salary:"+e1.getAnnualSalary());
        e1.raiseSalary(10);
        System.out.println("Monthly Salary After Raise:"+e1.getSalary());
        System.out.println("Annual Salary After Raise:"+e1.getSalary());
    }
}