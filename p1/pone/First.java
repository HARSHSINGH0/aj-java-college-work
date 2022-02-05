package pone;
public class First{
    private int i=20;//can be accesed from the same class
    int  j=30;
    protected int k=30;
    public int l=50;
}
class Derived extends First{
    void print(){
        System.out.println("J:"+j);//can be accesed from the derived class
        System.out.println("K:"+k);//can be accesed from the derived class
    }
}
class Other{
    void print(){
        First a1=new First();
        System.out.println("J:"+a1.j);//can be accesed from the other clas
        System.out.println("L:"+a1.l);
    }
}