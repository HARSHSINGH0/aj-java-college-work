class Pair <T,U> {
    T key;
    U value;
    void setKey(T i){
        key=i;
    }
    void setValue(U j){
        value=j;
    }
    T getKey(){
        return key;
    }
    U getValue(){
        return value;
    }
}
class PairTest{
    public static void main(String [] args){
        Pair<Integer,String> p1=new Pair<>();
        p1.setKey(1262);
        p1.setValue("Harsh Singh");
        System.out.println("Key"+p1.getKey()+"\nValue:"+p1.getValue());

    }
}
