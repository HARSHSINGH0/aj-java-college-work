// Design a class FizzBuzz model with one integer attribute
//print Fizz if number is divisible by 3
//print Buzz if number is divisible by 5
//if number is divisible by both then FizzBuzz and it if not divisible by any then print same number
class FizzBuzz{
    int number;
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //utility method
    String printFizzBuzz(){
        String result="";
        if (number%3==0){
            result+="Fizz";
        }
        if (number%5==0){
            result+="Buzz";
        }
        if (result==""){
            result+=number;
        }
        return result;
    }
}
class FizzBuzzTest{
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=1;i<100;i++) {
            fb.setNumber(i);
            System.out.print(fb.printFizzBuzz()+" ");
        }
    
    }
}