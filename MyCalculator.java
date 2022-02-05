// objective-Design a Calculator to provide basic operations such as Addtion,
// Subtraction,Multiplication and Divisionusing using OOPs concepts

class MyCalculator{
    // to achieve encaptulation -private
    private double numberOne,numberTwo,result;

    //define mutators to set the value of attributes
    public void setNumberOne(double n1){
        numberOne=n1;
    }
    public void setNumberTwo(double n2){
        numberTwo=n2;
    }
    //def getters to get the values of attributes
    public double getNumberOne(){
        return numberOne;
    }
    public double getNumberTwo(){
        return numberTwo;
    }
    //utility methods 
    double addtion(){
        //compute the result
        result=numberOne+numberTwo;
        return result;
    }
    double subtraction(){
        //compute the result
        result=numberOne-numberTwo;
        return result;
    }
    double multiplication(){
        //compute the result
        result=numberOne*numberTwo;
        return result;
    }
    double division(){
        result=numberOne/numberTwo;
        return result;
    }
}
//Design the test class
class CalculatorTest{
    public static void main(String[]args) {
        //use the calculator class
        //create an object of calculator class
        MyCalculator c1=new MyCalculator();
        //set numberOne and numberTwo
        c1.setNumberOne(15);
        c1.setNumberTwo(3);
        //perform addition 
        System.out.println("Addition:"+c1.addtion());
        System.out.println("Substraction:"+c1.subtraction());
        System.out.println("Multiplication:"+c1.multiplication());
        System.out.println("Division:"+c1.division());
    }
}