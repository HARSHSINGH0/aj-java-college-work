// Design a class bankaccount to represent customers in a bank.
// provide facilities such as withdraw, deposit and transfer funds
// for the account. Assume appropriate data members.design a test class 
// to test the functionality.Minimum balance in account should be 500 rupees


class BankAccount{
    //Instance variable
    private long accno;
    private String acName;
    private double balance;
    BankAccount(){
        this.accno=0;
        this.acName=" ";
        this.balance=0.0;

    }
    BankAccount(long accno,String acName,double balance){
        this.accno=accno;
        this.acName=acName;
        this.balance=balance;
    }
    //Access and mutators
    public void setAccno(long accno){
        this.accno=accno;
    }
    public void setAccName(String acName){
        this.acName=acName;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public long getAccno(){
        return this.accno;
    }
    public String getAcname(){
        return this.acName;
    
    }
    public double getBalance(){
        return this.balance;
    }
    void deposit(double amt){
        this.balance=this.balance+amt;
    }
    boolean withdraw(double amt){
        if (this.balance-amt>=500){
            this.balance=this.balance-amt;
            return true;
        }
        else{
            return false;
        }
    }
    boolean transfer(BankAccount target,double amt){
        if(this.withdraw(amt)){
            target.deposit(amt);
            return true;

        }
        else{
            return false;
        }

    }
}
class AccountTest{
    public static void main(String[] args){
        //deposit example
        BankAccount b1=new BankAccount();
        System.out.println("before:"+b1.getBalance());
        b1.deposit(1000);
        System.out.println("After:"+b1.getBalance());

        BankAccount b2=new BankAccount(101,"harsh",95000);
        System.out.println("before:"+b2.getBalance());
        b2.deposit(1000);
        System.out.println("After:"+b2.getBalance());


        //withdrawl example
        BankAccount b3=new BankAccount(10,"harsh1",5000);
        System.out.println("before:"+b3.getBalance());
        if (b3.withdraw(1000)){
            System.out.println("Withdrawl successful");
        }
        else{
            System.out.println("Insufficient funds");
        }
        System.out.println("After:"+b3.getBalance());

        //transfer example
        System.out.println("Acc No:"+b3.getAccno()+
        " Name:"+b3.getAcname()+" Balance:"+b3.getBalance());
        System.out.println("Acc No:"+b2.getAccno()+
        " Name:"+b2.getAcname()+" Balance:"+b2.getBalance());
        if (b3.transfer(b2,5000)){
            System.out.println("transfer successfull");
        
        }
        else{
            System.out.println("Insufficient funds");
        }
        System.out.println("Acc No:"+b3.getAccno()+
        " Name:"+b3.getAcname()+" Balance:"+b3.getBalance());
        System.out.println("Acc No:"+b2.getAccno()+
        " Name:"+b2.getAcname()+" Balance:"+b2.getBalance());

        System.out.println("Acc No:"+b3.getAccno()+
        " Name:"+b3.getAcname()+" Balance:"+b3.getBalance());
        System.out.println("Acc No:"+b2.getAccno()+
        " Name:"+b2.getAcname()+" Balance:"+b2.getBalance());
        if (b3.transfer(b2,100)){
            System.out.println("transfer successfull");
        
        }
        else{
            System.out.println("Insufficient funds");
        }
        System.out.println("Acc No:"+b3.getAccno()+
        " Name:"+b3.getAcname()+" Balance:"+b3.getBalance());
        System.out.println("Acc No:"+b2.getAccno()+
        " Name:"+b2.getAcname()+" Balance:"+b2.getBalance());
        
    }
}