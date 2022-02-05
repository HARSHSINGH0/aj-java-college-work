
class SmallBags{
    public int SmallBagsuse(int big,int small,int goal){
        int result = -1;
        if (big * 5 >= goal) {
            if (small>= goal % 5){
                result = goal % 5;
            }
                
        } else {
            if (small >= goal - big * 5) {
                result = goal - big * 5;
            }
        }
        return result;
    }
}
class ricebag1{
    public static void main(String[] args){
        SmallBags g1=new SmallBags();
        System.out.println(g1.SmallBagsuse(1,2,10));
        System.out.println(g1.SmallBagsuse(5,0,10));
    }
}