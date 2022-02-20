class Box<T extends Number>
{
	T item;
	void setItem(T i){
		item=i;
	}
	T getItem(){
        return item;
    }
    Box(){}
    Box(T i){
        item=i;
    }
}
class BoxTest{
    public static void main(String[] args){
        //1)explicit instantiation
        Box<Integer> b1=new Box<Integer>();
        b1.setItem(10);
        System.out.println("Value is:"+b1.getItem());
        //2)Diamond inference
        // Box <String> b2=new Box<>();
        // b2.setItem("Hello");
        // System.out.println("Value is:"+b2.getItem());
        //3)constructor
        Box<Double> b3=new Box<>(10.5);
        System.out.println("Value is:"+b3.getItem());
    }
}
