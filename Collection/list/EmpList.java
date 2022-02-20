import java.util.*;
class Employee {
    int id;
    String ename;
    Employee(int id,String ename){
        this.id=id;
        this.ename=ename;
    }
    public String toString(){
        return "Eid:"+id+"\nEname:"+ename;
    }
}
class EmpList{
    public static void main(String[] args) {
        //create and instantiate an ArrayList
        ArrayList<Employee> list1=new ArrayList<>();
        Employee e1=new Employee(101,"ABC");
        Employee e2=new Employee(102,"PQR");
        Employee e3=new Employee(103,"XYZ");
        Employee e4=new Employee(104,"XYZ1");

        //add an element to the list
        list1.add(e1);
        list1.add(e2);
        
        //insert at a specific position
        list1.add(1,e3);
        //remove at index position
        list1.remove(2);
        //set data at specfic location
        list1.set(1,e4);
        //collection based for loop to traverse
        for(Employee e:list1){
            System.out.println(e.toString());
        }
    }
}
