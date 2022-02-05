//designn aclass employeee with attributes
// design a permenant emp and temp emp by deriving/inherting emp class
// provide facility to dynamically calc salary
class Employee{
    int eid;
    String ename;
    double salary;
    Employee(int eid, String ename){
        this.eid = eid;
        this.ename = ename;
    }
    int getEid(){
        return eid;
    }
    String getEname(){
        return ename;
    }
    double getSalary(){
        return salary;
    }
    void calSalary(){}
}
class TemporaryEmployee extends Employee{
    double numberOfDays;
    double dailyWages;
    //constructor
    TemporaryEmployee(int eid, String ename, double numberOfDays, double dailyWages){
        super(eid, ename);
        this.numberOfDays = numberOfDays;
        this.dailyWages =dailyWages;
    }
    //override calSalary method
    void calSalary(){
        salary=this.numberOfDays*dailyWages;//check here
    }
    
}
class PermanentEmployee extends Employee{
    double basicsalary;
    //constants
    static double DA=110;//percent of basic salary
    static double HRA=30;//percent of basic salary
    static double TA=1600;//fixed amt
    static double PF=12.5;//percent of basic salary
    PermanentEmployee(int eid, String ename,double salary){
        super(eid, ename);
        this.basicsalary = salary;
    }
    //override calSalary method
    void calSalary(){
        salary=basicsalary+(basicsalary*DA/100)+(basicsalary*HRA/100)+TA-(basicsalary*PF/100);
    }
    
}
class EmpClass{
    public static void main(String[] args) {
        Employee e1=new Employee(1,"harsh");
        // System.out.println("Eid:"+e1.getEid()+"\nEname:"+e1.getEname()+"\nSalary:"+e1.getSalary());
        // System.out.println("******************************************************");
        TemporaryEmployee e2= new TemporaryEmployee(2,"Ajay",12,1000);
        // e2.calSalary();
        // System.out.println("Eid:"+e2.getEid()+"\nEname:"+e2.getEname()+"\nSalary:"+e2.getSalary());
        // System.out.println("******************************************************");
        PermanentEmployee e3= new PermanentEmployee(3,"Rahul",500);
        // e3.calSalary();
        // System.out.println("Eid:"+e3.getEid()+"\nEname:"+e3.getEname()+"\nSalary:"+e3.getSalary());
        //Dynamic method dispatch
        Employee [] emps=new Employee[3];
        emps[0]=e1;
        emps[1]=e2;
        emps[2]=e3;
        for(int i=0;i<emps.length;i++){
            emps[i].calSalary();
            System.out.println("Eid:"+emps[i].getEid()+"\nEname:"+emps[i].getEname()+"\nSalary:"+emps[i].getSalary());
            System.out.println("******************************************************");
        }
        
    }
}
