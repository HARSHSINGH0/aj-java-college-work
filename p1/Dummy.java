import pone.*;
class OtherPack extends First{
    void met1(){
        System.out.println("K:"+k);//can be accessed protected
    }
}
class Dummy {
    public static void main(String[] args){
        First f1=new First();
        System.out.println("L:"+f1.l);
        //System.out.println("I:"+f1.i);//is not accessible
        //System.out.println("J:"+f1.j);//is not accessible-default other package
        // System.out.println("k:"+f1.k);
        
    }
}