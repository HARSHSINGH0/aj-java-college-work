class Employee2{
    String firstName;
    String lastName;
    double salary;
    public Employee2(){
        System.out.println("default");
    }
    public Employee2(int x){
        System.out.println("int ");
    }
    public Employee2(double x){
        System.out.println("double");
    }

}
class Employee1{
    public static void main(String[] args){
        Employee2 e1=new Employee2();
        System.out.println(e1);
        }
}